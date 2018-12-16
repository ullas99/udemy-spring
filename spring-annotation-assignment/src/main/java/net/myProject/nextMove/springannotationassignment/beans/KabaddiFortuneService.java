package net.myProject.nextMove.springannotationassignment.beans;

import net.myProject.nextMove.springannotationassignment.interfaces.FortuneService;
import net.myProject.nextMove.springannotationassignment.interfaces.FortuneWheel;

public class KabaddiFortuneService implements FortuneService {
	
	private FortuneWheel kabaddiWheel;

	@Override
	public String provideTodaysFortune() {
		
		return this.kabaddiWheel.runTheWheel();
	}

	public FortuneWheel getKabaddiWheel() {
		return kabaddiWheel;
	}

	public void setKabaddiWheel(FortuneWheel kabaddiWheel) {
		this.kabaddiWheel = kabaddiWheel;
	}
	

}
