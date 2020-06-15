package com.majedbadawi.springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class SuperFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Super Fortune!";
	}
	
}
