package br.com.joaofelipefaria.payments.debt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaofelipefaria.payments.debt.dto.DebitRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import br.com.joaofelipefaria.payments.common.dto.OperationDTO;
import br.com.joaofelipefaria.payments.common.services.OperationService;

@RestController
@RequestMapping("/debit")
@RequiredArgsConstructor
public class DebitController {

    private final OperationService operationService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OperationDTO debit(@Valid @RequestBody DebitRequest request) {

        return operationService.withdraw(
                request.accountId(),
                request.value()
        );
    }

    @PostMapping("/rollback")
    @ResponseStatus(HttpStatus.CREATED)
    public OperationDTO rollback(@Valid @RequestBody DebitRequest request) {

        return operationService.deposit(
                request.accountId(),
                request.value()
        );
    }

}