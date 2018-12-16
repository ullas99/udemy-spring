package net.myProject.nextMove.springannotationassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import net.myProject.nextMove.springannotationassignment.beans.KabaddiCoach;
import net.myProject.nextMove.springannotationassignment.beans.KabaddiFortuneService;
import net.myProject.nextMove.springannotationassignment.beans.KabadiWheel;
import net.myProject.nextMove.springannotationassignment.interfaces.Coach;
import net.myProject.nextMove.springannotationassignment.interfaces.FortuneService;
import net.myProject.nextMove.springannotationassignment.interfaces.FortuneWheel;

@Configuration
@ComponentScan(basePackages="net.myProject.nextMove.springannotationassignment")
/*@PropertySource("classpath:coach.properties")*/
public class SpringJavaConfig {
	
	@Bean(initMethod="postConstructOfBean")
	public FortuneWheel kabadiWheel(){
		return new KabadiWheel();
	}
	
	@Bean
	public FortuneService kabaddiFortuneService(){
		KabaddiFortuneService kabaddiFortuneService = new KabaddiFortuneService();
		kabaddiFortuneService.setKabaddiWheel(kabadiWheel());
		
		return kabaddiFortuneService;
	}
	
	@Bean
	public Coach kabaddiCoach(){
		KabaddiCoach kabaddiCoach  = new KabaddiCoach();
		kabaddiCoach.setKabaddiCoachFortuneService(kabaddiFortuneService());
		
		return kabaddiCoach;
	}

}
