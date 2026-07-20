package br.com.joaofelipefaria.payments.common.services;

import java.math.BigDecimal;
import java.util.List;

import br.com.joaofelipefaria.payments.common.dto.AccountDTO;

public interface AccountService {

    AccountDTO create(AccountDTO dto);

    AccountDTO findById(Long id);

    List<AccountDTO> findByUser(Long userId);

    void updateBalance(Long accountId, BigDecimal balance);
}
