package net.nextmove.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.nextmove.springannotations.interfaces.Coach;

public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springLifeCycleBean.xml");
		
		Coach kabaddiCoach = context.getBean("kabaddiCoach", Coach.class);
		System.out.println(kabaddiCoach.getWorkoutSchedule());
		
		context.close();
	}
}
