package com.food.ordering.system.payment.service.domain.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
@Data
@Configuration
@ConfigurationProperties(prefix = "payment-service")
public class PaymentServiceConfigData {

    private String paymentRequestTopicName;
    private String paymentResponseTopicName;
}