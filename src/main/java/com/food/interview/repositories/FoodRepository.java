package com.food.interview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.interview.domain.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

	
	
}
