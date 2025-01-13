package com.food.ordering.system.restaurant.service.domain.ports.output.repository;

import com.food.ordering.restaurant.service.domain.entity.Restaurant;

import java.util.Optional;

/**
 * @author sony
 * @description
 * @since 2025.01.13
 **********************************************************************************************************************/
public interface RestaurantRepository {

    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}