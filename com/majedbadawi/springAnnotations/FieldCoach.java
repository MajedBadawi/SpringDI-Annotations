package com.majedbadawi.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FieldCoach implements Coach{
	//configure DI (using field)
	@Autowired
	@Qualifier("superFortuneService") //specify implementation
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Train 10 hours of tennis";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
