package net.nextmove.spring5webapp.entities.impls;

import net.nextmove.spring5webapp.entities.FortuneService;

public class FortuneServiceImpl implements FortuneService {

	@Override
	public void provideFortuneForToday() {
		System.out.println("*************** Be humble **********");
		
	}

}
