package com.punam.Conference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.punam.service.SpeakerService;

public class Application 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	//SpeakerService service = new SpeakerServiceImpl();
       
       SpeakerService service = context.getBean("speakerService",SpeakerService.class);
       System.out.println(service.findAll().get(0).getFirstName());
    }
}
