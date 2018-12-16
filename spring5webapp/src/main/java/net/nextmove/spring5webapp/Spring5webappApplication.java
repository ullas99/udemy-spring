package net.nextmove.spring5webapp;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.nextmove.spring5webapp.entities.Coach;

public class Spring5webappApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springLifeCycleBean.xml");
		
		Coach cricketCoach = applicationContext.getBean("cricketCoach", Coach.class);
		cricketCoach.getFortuneForToday();
		cricketCoach.getTrainingSchedule();
		
		applicationContext.close();
	}
}
