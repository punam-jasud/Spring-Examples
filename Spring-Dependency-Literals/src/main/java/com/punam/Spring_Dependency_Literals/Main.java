package com.punam.Spring_Dependency_Literals;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		
		Bike bike = (Bike)context.getBean("bike");
		bike.showColor();
		
		Car car = (Car)context.getBean("car");
		car.showColor();
		
	}

}
