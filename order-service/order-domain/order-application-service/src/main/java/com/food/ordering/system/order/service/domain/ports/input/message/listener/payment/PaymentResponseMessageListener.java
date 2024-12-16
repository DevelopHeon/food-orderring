package com.food.ordering.system.order.service.domain.ports.input.message.listener.payment;

import com.food.ordering.system.order.service.domain.dto.message.PaymentResponse;

/**
 * @author sony
 * @description
 * @since 2024.12.16
 **********************************************************************************************************************/
public interface PaymentResponseMessageListener {

    void paymentCompleted(PaymentResponse paymentResponse);
    void paymentCancelled(PaymentResponse paymentResponse);
}