package spring.dependency.objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		
		Bike bike = (Bike)context.getBean("bike");
		bike.startEngine();
		
		Car car = (Car)context.getBean("car");
		car.startEngine();
	}

}
