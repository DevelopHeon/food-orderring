package payment.service.domain.event;

import payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
public class PaymentFailedEvent extends PaymentEvent{

    public PaymentFailedEvent(Payment payment, ZonedDateTime createdAt, List<String> failureMessages) {
        super(payment, createdAt, failureMessages);
    }
}