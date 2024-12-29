package com.food.ordering.system.order.service.dataaccess.customer.repository;

import com.food.ordering.system.order.service.dataaccess.customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author sony
 * @description
 * @since 2024.12.29
 **********************************************************************************************************************/
@Repository
public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, UUID> {
}