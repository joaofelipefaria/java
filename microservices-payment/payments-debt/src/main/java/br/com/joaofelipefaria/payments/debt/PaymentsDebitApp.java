package br.com.joaofelipefaria.payments.debt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(
		basePackages = "br.com.joaofelipefaria.payments.common.entities")
@EnableJpaRepositories(
		basePackages = "br.com.joaofelipefaria.payments.common")
@ComponentScan(basePackages = {
		"br.com.joaofelipefaria.payments.debt", 
		"br.com.joaofelipefaria.payments.common"})
public class PaymentsDebitApp {

    public static void main(String[] args) {
        SpringApplication.run(PaymentsDebitApp.class, args);
    }

}