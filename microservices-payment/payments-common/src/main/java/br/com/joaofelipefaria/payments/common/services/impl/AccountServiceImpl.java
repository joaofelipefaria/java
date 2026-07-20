package br.com.joaofelipefaria.payments.common.services.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.joaofelipefaria.payments.common.dto.AccountDTO;
import br.com.joaofelipefaria.payments.common.entities.Account;
import br.com.joaofelipefaria.payments.common.entities.User;
import br.com.joaofelipefaria.payments.common.repository.AccountRepository;
import br.com.joaofelipefaria.payments.common.repository.UserRepository;
import br.com.joaofelipefaria.payments.common.services.AccountService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final UserRepository userRepository;

    @Override
    @Transactional
    public AccountDTO create(AccountDTO dto) {
        User user = resolveUser(dto.userId());

        Account account = Account.builder()
                .identifier(dto.identifier())
                .balance(dto.balance() != null ? dto.balance() : BigDecimal.ZERO)
                .user(user)
                .build();

        return toDto(accountRepository.save(account));
    }

    @Override
    @Transactional(readOnly = true)
    public AccountDTO findById(Long id) {
        return accountRepository.findById(id)
                .map(this::toDto)
                .orElseThrow(() -> new IllegalArgumentException("Account not found: " + id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<AccountDTO> findByUser(Long userId) {
        return accountRepository.findByUserId(userId).stream()
                .map(this::toDto)
                .toList();
    }

    @Override
    @Transactional
    public void updateBalance(Long accountId, BigDecimal balance) {
        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new IllegalArgumentException("Account not found: " + accountId));
        account.setBalance(balance);
        accountRepository.save(account);
    }

    private User resolveUser(Long userId) {
        if (userId == null) {
            return null;
        }

        return userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found: " + userId));
    }

    private AccountDTO toDto(Account account) {
        return new AccountDTO(
                account.getId(),
                account.getUser() != null ? account.getUser().getId() : null,
                account.getIdentifier(),
                account.getBalance());
    }
}
