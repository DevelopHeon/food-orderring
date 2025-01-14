package com.food.ordering.system.restaurant.service.domain.ports.output.repository;

import com.food.ordering.system.restaurant.service.domain.entity.OrderApproval;

/**
 * @author sony
 * @description
 * @since 2025.01.13
 **********************************************************************************************************************/
public interface OrderApprovalRepository {

    OrderApproval save(OrderApproval orderApproval);
}