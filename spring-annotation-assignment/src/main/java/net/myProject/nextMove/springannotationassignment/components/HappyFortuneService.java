package net.myProject.nextMove.springannotationassignment.components;

import org.springframework.stereotype.Component;

import net.myProject.nextMove.springannotationassignment.interfaces.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String provideTodaysFortune() {
		return "Work hard !!!!!";
	}

}
