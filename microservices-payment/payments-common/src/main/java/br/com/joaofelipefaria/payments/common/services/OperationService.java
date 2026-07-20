package br.com.joaofelipefaria.payments.common.services;

import java.math.BigDecimal;
import java.util.List;

import br.com.joaofelipefaria.payments.common.dto.OperationDTO;

public interface OperationService {

    OperationDTO deposit(Long accountId, BigDecimal value);

    OperationDTO withdraw(Long accountId, BigDecimal value);

    OperationDTO transfer(Long originId, Long destinyId, BigDecimal value);

    List<OperationDTO> history(Long accountId);
}
