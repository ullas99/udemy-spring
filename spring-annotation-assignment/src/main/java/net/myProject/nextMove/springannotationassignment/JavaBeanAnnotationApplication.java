package net.myProject.nextMove.springannotationassignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.myProject.nextMove.springannotationassignment.beans.KabaddiCoach;
import net.myProject.nextMove.springannotationassignment.config.SpringJavaConfig;

public class JavaBeanAnnotationApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		KabaddiCoach kabaddiCoach = context.getBean("kabaddiCoach", KabaddiCoach.class);
		KabaddiCoach kabaddiCoach2 = context.getBean("kabaddiCoach", KabaddiCoach.class);
		KabaddiCoach kabaddiCoach3 = context.getBean("kabaddiCoach", KabaddiCoach.class);
		
		System.out.println(" Todays Kabaddi work out by Coach :::::  "+kabaddiCoach.getWorkoutPlan());
		System.out.println(" Todays Kabaddi Fortune from Kabaddi Fortune wheel ::::: "+kabaddiCoach2.getTodaysFortune());
		
		System.out.println("Kabaddi Team name :::: "+kabaddiCoach3.getTeamName());
		System.out.println(" Kabaddi City Name :::::  "+kabaddiCoach3.getCityName());

	}

}
