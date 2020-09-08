package spring.losecoupling.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
		
		Company company = context.getBean("company",Company.class);
		company.companyWork();
	}

}
