package com.punam.anno.value;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
		Employee emp = context.getBean("employee",Employee.class);
		emp.showDetails();
	}

}
