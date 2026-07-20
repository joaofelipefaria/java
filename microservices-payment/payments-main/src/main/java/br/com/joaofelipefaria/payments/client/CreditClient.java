package br.com.joaofelipefaria.payments.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.joaofelipefaria.payments.common.dto.OperationDTO;
import br.com.joaofelipefaria.payments.dto.OperationRequest;

@FeignClient(name = "payments-credit", url = "${payments.services.base-url:http://localhost:8081}")
public interface CreditClient {

    @PostMapping("/credit")
    OperationDTO credit(@RequestBody OperationRequest request);
}
