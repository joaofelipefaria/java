package br.com.joaofelipefaria.payments.dto;

import java.math.BigDecimal;

public record PaymentResponse(
        Long accountOriginId,
        Long accountDestinyId,
        BigDecimal value,
        String status
) {
}
