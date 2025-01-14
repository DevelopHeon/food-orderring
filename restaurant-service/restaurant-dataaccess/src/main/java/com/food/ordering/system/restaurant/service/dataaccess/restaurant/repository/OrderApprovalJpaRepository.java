package com.food.ordering.system.restaurant.service.dataaccess.restaurant.repository;

import com.food.ordering.system.restaurant.service.dataaccess.restaurant.entity.OrderApprovalEntity;
import com.food.ordering.system.restaurant.service.domain.entity.OrderApproval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author sony
 * @description
 * @since 2025.01.13
 **********************************************************************************************************************/
@Repository
public interface OrderApprovalJpaRepository extends JpaRepository<OrderApprovalEntity, UUID> {
}