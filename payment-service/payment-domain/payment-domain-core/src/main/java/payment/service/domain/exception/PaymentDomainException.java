package payment.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

/**
 * @author sony
 * @description
 * @since 2025.01.07
 **********************************************************************************************************************/
public class PaymentDomainException extends DomainException {


    public PaymentDomainException(String message) {
        super(message);
    }

    public PaymentDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}