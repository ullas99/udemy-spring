package net.myProject.nextMove.springannotationassignment.beans;

import org.springframework.beans.factory.annotation.Value;

import net.myProject.nextMove.springannotationassignment.interfaces.Coach;
import net.myProject.nextMove.springannotationassignment.interfaces.FortuneService;

public class KabaddiCoach implements Coach {
	
	private FortuneService kabaddiCoachFortuneService;
	
	@Value("${team.name}")
	private String teamName;
	
	@Value("${team.city}")
	private String cityName;
	
	public KabaddiCoach() {
		System.out.println(" Kabaddi Coach Constructor called ");
	}

	@Override
	public String getWorkoutPlan() {
		return "Do 100 tackles and 1000 Raids";
	}

	@Override
	public String getTodaysFortune() {
		return this.kabaddiCoachFortuneService.provideTodaysFortune();
	}

	public FortuneService getKabaddiCoachFortuneService() {
		return kabaddiCoachFortuneService;
	}

	public void setKabaddiCoachFortuneService(FortuneService kabaddiCoachFortuneService) {
		this.kabaddiCoachFortuneService = kabaddiCoachFortuneService;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	

}
