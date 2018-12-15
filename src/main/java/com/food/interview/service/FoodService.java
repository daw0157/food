package com.food.interview.service;

import java.util.List;

import com.food.interview.domain.Food;

public interface FoodService {

	Food findFoodById(Long id);
	
	List<Food> findAllFoods();

	Food saveFood(Food food);
	
}
