package payment.service.domain;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import payment.service.domain.entity.CreditEntry;
import payment.service.domain.entity.CreditHistory;
import payment.service.domain.entity.Payment;
import payment.service.domain.event.PaymentCancelledEvent;
import payment.service.domain.event.PaymentCompletedEvent;
import payment.service.domain.event.PaymentEvent;
import payment.service.domain.event.PaymentFailedEvent;

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