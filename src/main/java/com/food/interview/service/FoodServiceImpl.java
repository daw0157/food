package com.food.interview.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.food.interview.domain.Food;
import com.food.interview.repositories.FoodRepository;

@Service
public class FoodServiceImpl implements FoodService {
	
	private final FoodRepository foodRepository; 

	public FoodServiceImpl(FoodRepository foodRepository) {
		this.foodRepository = foodRepository;
	}

	@Override
	public Food findFoodById(Long id) {
		return foodRepository.findById(id).get();
	}

	@Override
	public List<Food> findAllFoods() {
		return foodRepository.findAll();
	}

	@Override
	public Food saveFood(Food food) {
		return foodRepository.save(food);
	}

}
