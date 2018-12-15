package com.food.interview.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.food.interview.domain.Food;
import com.food.interview.repositories.FoodRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final FoodRepository foodRepository;
	
	public BootStrapData(FoodRepository foodRepository) {
		this.foodRepository = foodRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Setting up data");
		
		Food f1 = new Food();
		f1.setId(1L);
		f1.setName("Tomato");
		foodRepository.save(f1);
		
		Food f2 = new Food();
		f2.setId(2L);
		f2.setName("Pizza");
		foodRepository.save(f2);
		
		Food f3 = new Food();
		f3.setId(3L);
		f3.setName("Squash");
		foodRepository.save(f3);
		
		System.out.println("Foods: " + foodRepository.count());
	}

	
	
}
