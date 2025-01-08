package payment.service.domain.event;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;
import java.util.Collections;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
public class PaymentCancelledEvent extends PaymentEvent {

    private final DomainEventPublisher<PaymentCancelledEvent> paymentCancelledEventDomainEventPublisher;
    public PaymentCancelledEvent(Payment payment, ZonedDateTime createdAt, DomainEventPublisher<PaymentCancelledEvent> paymentCancelledEventDomainEventPublisher) {
        super(payment, createdAt, Collections.emptyList());
        this.paymentCancelledEventDomainEventPublisher = paymentCancelledEventDomainEventPublisher;
    }

    @Override
    public void fire() {
        paymentCancelledEventDomainEventPublisher.publish(this);
    }
}