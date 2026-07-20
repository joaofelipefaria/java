package br.com.joaofelipefaria.payments.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record PaymentRequest(

        @NotNull
        Long userId,

        @NotNull
        Long accountOriginId,

        @NotNull
        Long accountDestinyId,

        @NotNull
        @DecimalMin("0.01")
        BigDecimal value

) {
}