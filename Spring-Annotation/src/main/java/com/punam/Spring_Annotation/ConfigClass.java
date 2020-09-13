package com.punam.Spring_Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "spring.annotationconfig")
public class ConfigClass {
	
	
	@Bean
	public SoftwareEngineer engineer() {
		return new SoftwareEngineer();
	}
	
	@Bean
	public Company company() {
		Company company = new Company(engineer());
		return company;
	}
	
}
