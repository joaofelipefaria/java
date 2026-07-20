package br.com.joaofelipefaria.payments.debt.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public record DebitRequest(

        @NotNull
        Long accountId,

        @NotNull
        @DecimalMin("0.01")
        BigDecimal value

) {
}