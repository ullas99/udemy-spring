package net.nextmove.spring5webapp.entities.impls;

import net.nextmove.spring5webapp.entities.Coach;
import net.nextmove.spring5webapp.entities.FortuneService;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	public void onInitMethod(){
		System.out.println("************* COACH OBJECT IS CREATED **************");
	}
	
	public void onDestroyMethod(){
		System.out.println("********* COACH OBJECT IS DESTROYED ****************");
	}

	@Override
	public void getTrainingSchedule() {
		System.out.println("*************  WORK AS HARD AS YOU CAN *********************");
		
	}

	@Override
	public void getFortuneForToday() {
		this.fortuneService.provideFortuneForToday();
		
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
}
