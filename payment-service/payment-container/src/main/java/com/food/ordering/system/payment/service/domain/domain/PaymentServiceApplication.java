package com.food.ordering.system.payment.service.domain.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author sony
 * @description
 * @since 2025.01.13
 **********************************************************************************************************************/
@EnableJpaRepositories(basePackages = "com.food.ordering.system.payment.service.dataaccess")
@EntityScan(basePackages = "com.food.ordering.system.payment.service.dataaccess")
@SpringBootApplication(scanBasePackages = "com.food.ordering.system")
public class PaymentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication.class, args);
    }

}