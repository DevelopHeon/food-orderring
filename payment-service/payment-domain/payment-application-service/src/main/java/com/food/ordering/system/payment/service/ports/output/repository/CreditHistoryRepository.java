package com.food.ordering.system.payment.service.ports.output.repository;

import com.food.ordering.system.domain.valueobject.CustomerId;
import com.food.ordering.system.payment.service.entity.CreditHistory;

import java.util.List;
import java.util.Optional;

/**
 * @author sony
 * @description
 * @since 2025.01.08
 **********************************************************************************************************************/
public interface CreditHistoryRepository {

    CreditHistory save(CreditHistory creditHistory);

    Optional<List<CreditHistory>> findByCustomerId(CustomerId customerId);
}