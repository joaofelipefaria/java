package br.com.joaofelipefaria.payments.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import br.com.joaofelipefaria.payments.client.CreditClient;
import br.com.joaofelipefaria.payments.client.DebitClient;
import br.com.joaofelipefaria.payments.dto.OperationRequest;
import br.com.joaofelipefaria.payments.dto.PaymentResponse;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final DebitClient debitClient;
    private final CreditClient creditClient;

    public PaymentResponse processPayment(Long originAccountId, Long destinyAccountId, BigDecimal value) {
    	OperationRequest debitRequest = new OperationRequest(originAccountId, value);
    	OperationRequest creditRequest = new OperationRequest(destinyAccountId, value);
        debitClient.debit(debitRequest);
        creditClient.credit(creditRequest);
        return new PaymentResponse(originAccountId, destinyAccountId, value, "SUCCESS");
    }
}
