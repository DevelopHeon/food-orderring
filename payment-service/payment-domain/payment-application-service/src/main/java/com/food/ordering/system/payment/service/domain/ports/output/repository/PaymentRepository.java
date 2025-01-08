package com.food.ordering.system.payment.service.domain.ports.output.repository;

import payment.service.domain.entity.Payment;

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