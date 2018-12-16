package net.nextmove.springannotations.components;

import org.springframework.stereotype.Component;

import net.nextmove.springannotations.interfaces.Coach;

@Component
public class KabaddiCoach implements Coach {

	@Override
	public String getWorkoutSchedule() {
		return "************** YOUR TIME HAS COME TACKLE ***************";
	}

}
