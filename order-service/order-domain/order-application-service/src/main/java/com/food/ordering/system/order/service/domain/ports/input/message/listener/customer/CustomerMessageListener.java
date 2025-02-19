package com.food.ordering.system.order.service.domain.ports.input.message.listener.customer;

import com.food.ordering.system.order.service.domain.dto.message.CustomerModel;

/**
 * @since       2025.02.20
 * @author      sony
 * @description
 **********************************************************************************************************************/
public interface CustomerMessageListener {

    void customerCreated(CustomerModel customerModel);
}