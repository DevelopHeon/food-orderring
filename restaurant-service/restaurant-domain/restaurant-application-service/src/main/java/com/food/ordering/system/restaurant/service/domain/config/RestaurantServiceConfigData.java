package com.food.ordering.system.restaurant.service.domain.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author sony
 * @description
 * @since 2025.01.13
 **********************************************************************************************************************/
@Data
@Configuration
@ConfigurationProperties(prefix = "restaurant-service")
public class RestaurantServiceConfigData {

    private String restaurantApprovalRequestTopicName;
    private String restaurantApprovalResponseTopicName;
}