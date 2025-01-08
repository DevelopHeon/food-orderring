package payment.service.domain.event;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
public class PaymentFailedEvent extends PaymentEvent{

    private final DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher;
    public PaymentFailedEvent(Payment payment, ZonedDateTime createdAt, List<String> failureMessages, DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher) {
        super(payment, createdAt, failureMessages);
        this.paymentFailedEventDomainEventPublisher = paymentFailedEventDomainEventPublisher;
    }

    @Override
    public void fire() {
        paymentFailedEventDomainEventPublisher.publish(this);
    }
}