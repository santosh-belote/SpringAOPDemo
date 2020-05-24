package com.san.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeService {
	private static ApplicationContext factory;

	public static void main(String[] args) {
		factory = new ClassPathXmlApplicationContext("Spring.xml");
		Shape shape = factory.getBean("shape", Shape.class);
		
		shape.getCircle().setName("Second Circle");
	}
}
