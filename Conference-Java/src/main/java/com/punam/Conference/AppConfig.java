package com.punam.Conference;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.punam.repository.HibernateSpeakerRepositoryImpl;
import com.punam.repository.SpeakerRepository;
import com.punam.service.SpeakerService;
import com.punam.service.SpeakerServiceImpl;

@Configuration
@ComponentScan("com.punam")
public class AppConfig {
	
	
	/*
	 * @Bean(name = "speakerService")
	 * 
	 * @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	 * 
	 * public SpeakerService getSpeakerService() {
	 * 
	 * //SpeakerServiceImpl service = new
	 * SpeakerServiceImpl(getSpeakerRepository());
	 * 
	 * SpeakerServiceImpl service = new SpeakerServiceImpl();
	 * 
	 * //service.setRepository(getSpeakerRepository()); return service; }
	 * 
	 * @Bean(name = "speakerRepository") public SpeakerRepository
	 * getSpeakerRepository() { return new HibernateSpeakerRepositoryImpl(); }
	 */
	
}
