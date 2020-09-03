package com.myproject.SpringHelloWorldJavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	
	@Bean(name="CountryObj")
	public Country getCountry() {
		return new Country("India");
	}

}
