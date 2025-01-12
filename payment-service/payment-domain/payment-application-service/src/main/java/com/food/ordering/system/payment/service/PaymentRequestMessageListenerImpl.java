package com.food.ordering.system.payment.service;

import com.food.ordering.system.payment.service.dto.PaymentRequest;
import com.food.ordering.system.payment.service.ports.input.message.listener.PaymentRequestMessageListener;
import com.food.ordering.system.payment.service.event.PaymentEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
@Slf4j
@Service
public class PaymentRequestMessageListenerImpl implements PaymentRequestMessageListener {

    private final PaymentRequestHelper paymentRequestHelper;

    public PaymentRequestMessageListenerImpl(PaymentRequestHelper paymentRequestHelper) {
        this.paymentRequestHelper = paymentRequestHelper;
    }

    @Override
    public void completePayment(PaymentRequest paymentRequest) {
        PaymentEvent paymentEvent = paymentRequestHelper.persistPayment(paymentRequest);
        fireEvent(paymentEvent);
    }

    @Override
    public void cancelPayment(PaymentRequest paymentRequest) {
        PaymentEvent paymentEvent = paymentRequestHelper.persistCancelPayment(paymentRequest);
        fireEvent(paymentEvent);
    }

    private void fireEvent(PaymentEvent paymentEvent) {
        log.info("Publishing payment event with payment id: {} and order id: {}",
                paymentEvent.getPayment().getId().getValue(),
                paymentEvent.getPayment().getOrderId().getValue());

        paymentEvent.fire();
    }
}