package com.food.ordering.system.restaurant.service.domain.ports.input.message.listener;

import com.food.ordering.system.restaurant.service.domain.dto.RestaurantApprovalRequest;

/**
 * @author sony
 * @description
 * @since 2025.01.13
 **********************************************************************************************************************/
public interface RestaurantApprovalRequestMessageListener {

    void approveOrder(RestaurantApprovalRequest restaurantApprovalRequest);
}