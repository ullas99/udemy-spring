package net.spring.mvc.springmvc.components;

import org.springframework.stereotype.Component;

import net.spring.mvc.springmvc.interfaces.Coach;

@Component
public class BasketballCoach implements Coach {
	
	public BasketballCoach() {
		System.out.println("Basket ball Coach is created ");
	}

	@Override
	public String getWorkout() {
		
		return "Hit 3 for 100 times";
	}

}
