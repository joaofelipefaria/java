package br.com.joaofelipefaria.payments.credit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaofelipefaria.payments.credit.dto.CreditRequest;
import br.com.joaofelipefaria.payments.credit.service.CreditService;
import lombok.RequiredArgsConstructor;
import br.com.joaofelipefaria.payments.common.dto.OperationDTO;

@RestController
@RequestMapping("/credit")
@RequiredArgsConstructor
public class CreditController {

    private final CreditService creditService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OperationDTO credit(@RequestBody CreditRequest request) {

        return creditService.deposit(
                request.accountId(),
                request.value()
        );
    }

    @PostMapping("/rollback")
    @ResponseStatus(HttpStatus.CREATED)
    public OperationDTO creditRollBack(@RequestBody CreditRequest request) {

        return creditService.rollBack(
                request.accountId(),
                request.value()
        );
    }

}