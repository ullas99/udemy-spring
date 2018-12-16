package net.myProject.nextMove.springannotationassignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.myProject.nextMove.springannotationassignment.config.SpringJavaConfig;
import net.myProject.nextMove.springannotationassignment.interfaces.Coach;

public class SpringJavaAnnotationApplication {

	public static void  main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		Coach footballCoach = context.getBean("footballCoach", Coach.class);
		
		System.out.println("Todays workout plan by Coach ::::: "+footballCoach.getWorkoutPlan());
		System.out.println("Todays fortune for players ::::::  "+footballCoach.getTodaysFortune());
		
	}
	
}
