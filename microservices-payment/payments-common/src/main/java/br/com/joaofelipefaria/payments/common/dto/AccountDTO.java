package br.com.joaofelipefaria.payments.common.dto;

import java.math.BigDecimal;

public record AccountDTO(
        Long id,
        Long userId,
        String identifier,
        BigDecimal balance
) {
}
