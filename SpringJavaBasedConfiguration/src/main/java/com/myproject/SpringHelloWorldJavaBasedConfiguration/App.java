package com.myproject.SpringHelloWorldJavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Country country = (Country)context.getBean("CountryObj");
        String cname = country.getCountryName(); 	
        System.out.println("Country Name : "+cname);
    }
}
