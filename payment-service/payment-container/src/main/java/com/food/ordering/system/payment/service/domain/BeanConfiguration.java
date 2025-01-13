package com.food.ordering.system.payment.service.domain;

import com.food.ordering.system.payment.service.PaymentDomainService;
import com.food.ordering.system.payment.service.PaymentDomainServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sony
 * @description
 * @since 2025.01.13
 **********************************************************************************************************************/
@Configuration
public class BeanConfiguration {

    @Bean
    public PaymentDomainService paymentDomainService() {
        return new PaymentDomainServiceImpl();
    }
}