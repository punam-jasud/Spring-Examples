package com.myproject.ApplicationContext_Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Student student = (Student)context.getBean("student");
        student.displayName();
    }
}