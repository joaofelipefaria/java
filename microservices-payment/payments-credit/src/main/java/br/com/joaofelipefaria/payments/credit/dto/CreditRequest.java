package br.com.joaofelipefaria.payments.credit.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public record CreditRequest(

        @NotNull
        Long accountId,

        @NotNull
        @DecimalMin(value = "0.01")
        BigDecimal value

) {
}