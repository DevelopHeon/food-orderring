package com.food.ordering.system.payment.service;

import com.food.ordering.system.payment.service.entity.Payment;
import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.payment.service.entity.CreditEntry;
import com.food.ordering.system.payment.service.entity.CreditHistory;
import com.food.ordering.system.payment.service.event.PaymentCancelledEvent;
import com.food.ordering.system.payment.service.event.PaymentCompletedEvent;
import com.food.ordering.system.payment.service.event.PaymentEvent;
import com.food.ordering.system.payment.service.event.PaymentFailedEvent;

import java.util.List;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
public interface PaymentDomainService {

    PaymentEvent validateAndInitiatePayment(Payment payment,
                                            CreditEntry creditEntry,
                                            List<CreditHistory> creditHistories,
                                            List<String> failureMessages, DomainEventPublisher<PaymentCompletedEvent> paymentCompletedEventDomainEventPublisher, DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher);

    PaymentEvent validateAndCancelPayment(Payment payment,
                                          CreditEntry creditEntry,
                                          List<CreditHistory> creditHistories,
                                          List<String> failureMessages, DomainEventPublisher<PaymentCancelledEvent> paymentCancelledEventDomainEventPublisher, DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher);
}