package com.majedbadawi.springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigSpringApp {
	public static void main(String[] args) {
		System.out.println("Spring Container configuration using Java code only\n");
		
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		System.out.println("DI using constructor");
		//get the bean from the spring container
		Coach constructorCoach = context.getBean("constructorCoach", Coach.class);
		//call a bean method
		System.out.println(constructorCoach.getDailyWorkout());
		//call method to get the fortune
		System.out.println(constructorCoach.getDailyFortune());
		
		System.out.println();
		
		System.out.println("DI using setter");
		//get the bean from the spring container
		Coach setterCoach = context.getBean("setterCoach", Coach.class);	
		//call a bean method
		System.out.println(setterCoach.getDailyWorkout());
		//call method to get the fortune
		System.out.println(setterCoach.getDailyFortune());
		
		System.out.println();
		
		System.out.println("DI using field");
		//get the bean from the spring container
		Coach fieldCoach = context.getBean("fieldCoach", Coach.class);	
		//call a bean method
		System.out.println(fieldCoach.getDailyWorkout());
		//call method to get the fortune
		System.out.println(fieldCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}
}
