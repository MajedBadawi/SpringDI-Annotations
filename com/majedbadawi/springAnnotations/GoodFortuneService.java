package com.majedbadawi.springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class GoodFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Good Fortune!";
	}
	
}
