package br.com.joaofelipefaria.payments.credit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(
		basePackages = "br.com.joaofelipefaria.payments.common.entities")
@EnableJpaRepositories(
		basePackages = "br.com.joaofelipefaria.payments.common")
@ComponentScan(basePackages = {
		"br.com.joaofelipefaria.payments.credit", 
		"br.com.joaofelipefaria.payments.common"})
public class PaymentsCreditApp {

    public static void main(String[] args) {
        SpringApplication.run(PaymentsCreditApp.class, args);
    }

}