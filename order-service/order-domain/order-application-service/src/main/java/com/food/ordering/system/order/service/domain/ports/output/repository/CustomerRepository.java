package com.food.ordering.system.order.service.domain.ports.output.repository;

import com.food.ordering.system.order.service.domain.entity.Customer;

import java.util.Optional;
import java.util.UUID;

/**
 * @author sony
 * @description
 * @since 2024.12.16
 **********************************************************************************************************************/
public interface CustomerRepository {

    Optional<Customer> findCustomer(UUID customerId);
}