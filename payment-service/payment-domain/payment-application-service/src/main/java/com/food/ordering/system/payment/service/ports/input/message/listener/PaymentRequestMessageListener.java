package com.food.ordering.system.payment.service.ports.input.message.listener;

import com.food.ordering.system.payment.service.dto.PaymentRequest;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
public interface PaymentRequestMessageListener {

    void completePayment(PaymentRequest paymentRequest);
    void cancelPayment(PaymentRequest paymentRequest);
}