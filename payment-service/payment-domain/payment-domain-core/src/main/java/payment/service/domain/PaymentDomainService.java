package payment.service.domain;

import payment.service.domain.entity.CreditEntry;
import payment.service.domain.entity.CreditHistory;
import payment.service.domain.entity.Payment;
import payment.service.domain.event.PaymentEvent;

import java.util.List;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
public interface PaymentDomainService {

    PaymentEvent payEvent(Payment payment,
                          CreditEntry creditEntry,
                          List<CreditHistory> creditHistories,
                          List<String> failureMessages);

    PaymentEvent validateAndCancelPayment(Payment payment,
                                     CreditEntry creditEntry,
                                     List<CreditHistory> creditHistories,
                                     List<String> failureMessages);
}