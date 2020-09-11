package com.punam.Conference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.punam.service.SpeakerService;
import com.punam.service.SpeakerServiceImpl;

public class Application 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	SpeakerService service = appContext.getBean("speakerService",SpeakerService.class);
    	//System.out.println(service);
    	
       //SpeakerService service = new SpeakerServiceImpl();
    	
    	
    	//SpeakerService service2 = appContext.getBean("speakerService",SpeakerService.class);
    	//System.out.println(service2);  //Same object Address  if scope is singleton and different if scope is prototype
       
       System.out.println(service.findAll().get(0).getFirstName());
       System.out.println(service.findAll().get(0).getSeedNum());
    }
}
