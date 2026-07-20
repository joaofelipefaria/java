package br.com.joaofelipefaria.payments.common.services.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.joaofelipefaria.payments.common.dto.OperationDTO;
import br.com.joaofelipefaria.payments.common.entities.Account;
import br.com.joaofelipefaria.payments.common.entities.Operation;
import br.com.joaofelipefaria.payments.common.repository.AccountRepository;
import br.com.joaofelipefaria.payments.common.repository.OperationRepository;
import br.com.joaofelipefaria.payments.common.services.OperationService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OperationServiceImpl implements OperationService {

    private final OperationRepository operationRepository;
    private final AccountRepository accountRepository;

    @Override
    @Transactional
    public OperationDTO deposit(Long accountId, BigDecimal value) {
        validatePositive(value);

        Account account = findAccount(accountId);
        BigDecimal currentBalance = account.getBalance() != null ? account.getBalance() : BigDecimal.ZERO;
        account.setBalance(currentBalance.add(value));
        accountRepository.save(account);

        Operation operation = Operation.builder()
                .type("DEPOSIT")
                .value(value)
                .user(account.getUser())
                .accountDestiny(account)
                .build();

        return toDto(operationRepository.save(operation));
    }

    @Override
    @Transactional
    public OperationDTO withdraw(Long accountId, BigDecimal value) {
        validatePositive(value);

        Account account = findAccount(accountId);
        BigDecimal currentBalance = account.getBalance() != null ? account.getBalance() : BigDecimal.ZERO;

        if (currentBalance.compareTo(value) < 0) {
            throw new IllegalArgumentException("Insufficient funds for account: " + accountId);
        }

        account.setBalance(currentBalance.subtract(value));
        accountRepository.save(account);

        Operation operation = Operation.builder()
                .type("WITHDRAW")
                .value(value)
                .user(account.getUser())
                .accountOrigin(account)
                .build();

        return toDto(operationRepository.save(operation));
    }

    @Override
    @Transactional
    public OperationDTO transfer(Long originId, Long destinyId, BigDecimal value) {
        validatePositive(value);

        if (originId.equals(destinyId)) {
            throw new IllegalArgumentException("Origin and destination accounts cannot be the same");
        }

        Account origin = findAccount(originId);
        Account destiny = findAccount(destinyId);

        BigDecimal originBalance = origin.getBalance() != null ? origin.getBalance() : BigDecimal.ZERO;
        if (originBalance.compareTo(value) < 0) {
            throw new IllegalArgumentException("Insufficient funds for account: " + originId);
        }

        BigDecimal destinyBalance = destiny.getBalance() != null ? destiny.getBalance() : BigDecimal.ZERO;
        origin.setBalance(originBalance.subtract(value));
        destiny.setBalance(destinyBalance.add(value));
        accountRepository.save(origin);
        accountRepository.save(destiny);

        Operation operation = Operation.builder()
                .type("TRANSFER")
                .value(value)
                .user(origin.getUser() != null ? origin.getUser() : destiny.getUser())
                .accountOrigin(origin)
                .accountDestiny(destiny)
                .build();

        return toDto(operationRepository.save(operation));
    }

    @Override
    @Transactional(readOnly = true)
    public List<OperationDTO> history(Long accountId) {
        List<Operation> operations = new ArrayList<>();
        operations.addAll(operationRepository.findByAccountOriginId(accountId));
        operations.addAll(operationRepository.findByAccountDestinyId(accountId));

        Map<Long, Operation> uniqueOperations = operations.stream()
                .filter(operation -> operation.getId() != null)
                .collect(Collectors.toMap(
                        Operation::getId,
                        Function.identity(),
                        (existing, replacement) -> existing,
                        LinkedHashMap::new));

        return uniqueOperations.values().stream()
                .map(this::toDto)
                .toList();
    }

    private void validatePositive(BigDecimal value) {
        if (value == null || value.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Value must be greater than zero");
        }
    }

    private Account findAccount(Long accountId) {
        return accountRepository.findById(accountId)
                .orElseThrow(() -> new IllegalArgumentException("Account not found: " + accountId));
    }

    private OperationDTO toDto(Operation operation) {
        return new OperationDTO(
                operation.getId(),
                operation.getUser() != null ? operation.getUser().getId() : null,
                operation.getAccountOrigin() != null ? operation.getAccountOrigin().getId() : null,
                operation.getAccountDestiny() != null ? operation.getAccountDestiny().getId() : null,
                operation.getType(),
                operation.getValue());
    }
}
