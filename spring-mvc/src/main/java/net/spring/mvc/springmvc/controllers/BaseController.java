package net.spring.mvc.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.spring.mvc.springmvc.interfaces.Coach;

@RestController
public class BaseController {
	
	@Autowired
	ApplicationContext context;
	
	@RequestMapping(path="/hello")
	public String getHttpCalls(@RequestParam(required=false,name="greet") String greetings){
		
		Coach coach = context.getBean("basketballCoach", Coach.class);
		System.out.println("Work out by Basket Ball Coach :::: "+coach.getWorkout());
		
		return "*********** HELLO *************";
	}
}
