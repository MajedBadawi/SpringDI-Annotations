package com.majedbadawi.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class constructorCoach implements Coach {
	private FortuneService fortuneService;
	
	//configure DI (using constructor)
	@Autowired
	public constructorCoach(@Qualifier("goodFortuneService") FortuneService fortuneService) { //specify implementation
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Train 10 hours of base ball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
