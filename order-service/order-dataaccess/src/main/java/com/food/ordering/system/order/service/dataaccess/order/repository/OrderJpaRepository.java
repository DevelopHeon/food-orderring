package com.food.ordering.system.order.service.dataaccess.order.repository;

import com.food.ordering.system.order.service.dataaccess.order.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * @author sony
 * @description
 * @since 2024.12.29
 **********************************************************************************************************************/
@Repository
public interface OrderJpaRepository extends JpaRepository<OrderEntity, UUID> {

    Optional<OrderEntity> findByTrackingId(UUID trackingId);
}