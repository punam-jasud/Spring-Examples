package com.punam.Spring_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new  AnnotationConfigApplicationContext(ConfigClass.class); //ClassPathXmlApplicationContext("bean6.xml");
		
		Company company = context.getBean("company",Company.class);
		company.showDetails();
		company.engineer.development();
	}

}
