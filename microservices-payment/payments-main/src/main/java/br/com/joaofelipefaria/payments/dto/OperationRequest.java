package br.com.joaofelipefaria.payments.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record OperationRequest(

        @NotNull
        Long accountId,

        @NotNull
        @DecimalMin("0.01")
        BigDecimal value

) {
}