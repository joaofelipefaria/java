package br.com.joaofelipefaria.payments.credit.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import br.com.joaofelipefaria.payments.common.dto.OperationDTO;
import br.com.joaofelipefaria.payments.common.services.OperationService;

@Service
@RequiredArgsConstructor
public class CreditService {

    private final OperationService operationService;

    public OperationDTO deposit(Long accountId, BigDecimal value) {
        return operationService.deposit(accountId, value);
    }
}
