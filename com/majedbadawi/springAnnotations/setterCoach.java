package com.majedbadawi.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class setterCoach implements Coach {
	private FortuneService fortuneService;
	
	//configure DI (using setter)
	@Autowired
	public void setFortuneService(@Qualifier("badFortuneService") FortuneService fortuneService) { //specify implementation
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Train 10 hours of track";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
