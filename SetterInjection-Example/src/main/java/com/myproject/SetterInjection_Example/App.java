package com.myproject.SetterInjection_Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
       Employee employee = (Employee)context.getBean("emp");
       employee.displayDetails();
    }
}
