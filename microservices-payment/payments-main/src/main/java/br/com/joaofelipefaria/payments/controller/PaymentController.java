package br.com.joaofelipefaria.payments.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaofelipefaria.payments.dto.PaymentRequest;
import br.com.joaofelipefaria.payments.dto.PaymentResponse;
import br.com.joaofelipefaria.payments.service.PaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pay")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PaymentResponse pay(@Valid @RequestBody PaymentRequest request) {

        return paymentService.processPayment(
                request.accountOriginId(),
                request.accountDestinyId(),
                request.value()
        );
    }

}