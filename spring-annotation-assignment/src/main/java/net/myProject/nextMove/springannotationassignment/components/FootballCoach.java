package net.myProject.nextMove.springannotationassignment.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.myProject.nextMove.springannotationassignment.interfaces.Coach;
import net.myProject.nextMove.springannotationassignment.interfaces.FortuneService;

@Component
public class FootballCoach implements Coach {
	
	@Autowired
	@Qualifier("RESTFortuneService")
	FortuneService fortuneService;

	@Override
	public String getWorkoutPlan() {
		
		return "Practise free kicks for 1 hour";
	}

	@Override
	public String getTodaysFortune() {
		return this.fortuneService.provideTodaysFortune();
	}

}
