package br.com.joaofelipefaria.payments.common.dto;

import java.math.BigDecimal;

public record OperationDTO(
        Long id,
        Long userId,
        Long accountOriginId,
        Long accountDestinyId,
        String type,
        BigDecimal value
) {
}
