package net.myProject.nextMove.springannotationassignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.myProject.nextMove.springannotationassignment.interfaces.Coach;

public class SpringAnnotationAssignmentApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext 
				= new ClassPathXmlApplicationContext("springLifeCycleBean.xml");
		
		Coach footBallCoach  = applicationContext.getBean("footballCoach",Coach.class);
		
		System.out.println("Football Coach's workout:::: "+footBallCoach.getWorkoutPlan());
		
		System.out.println("FootBall coach's fortune provided:::: "+footBallCoach.getTodaysFortune());
		
	}
}
