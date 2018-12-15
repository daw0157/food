package com.food.interview.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.food.interview.domain.Food;
import com.food.interview.service.FoodService;

@RestController
@RequestMapping(FoodController.BASE_URL)
public class FoodController {
	
	public static final String BASE_URL = "/api/v1/foods";
	
	private final FoodService foodService;
	
	public FoodController(FoodService foodService) {
		this.foodService = foodService;
	}

	@GetMapping
	List<Food> getAllFoods(){
		return foodService.findAllFoods();
	}
	
	@GetMapping("/{id}")
	public Food getFoodById(@PathVariable  Long id) {
		return foodService.findFoodById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Food saveFood(@RequestBody Food food) {
		return foodService.saveFood(food);
	}
	
}
