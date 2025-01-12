package com.food.ordering.system.payment.service.ports.output.repository;

import com.food.ordering.system.payment.service.entity.Payment;

import java.util.Optional;
import java.util.UUID;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
public interface PaymentRepository {

    Payment save(Payment payment);

    Optional<Payment> findByOrderId(UUID orderId);
}