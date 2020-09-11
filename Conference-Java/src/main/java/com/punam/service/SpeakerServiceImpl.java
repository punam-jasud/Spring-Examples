package com.punam.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.punam.model.Speaker;
import com.punam.repository.HibernateSpeakerRepositoryImpl;
import com.punam.repository.SpeakerRepository;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository repository ;
	
	
	public SpeakerServiceImpl() {
		System.out.println("SpeakerServiceImpl no args Constructor");
	}
	
	//Constructor Injection
	@Autowired
	public SpeakerServiceImpl(SpeakerRepository repository) {
		System.out.println("SpeakerServiceImpl Repository Constructor");
		this.repository = repository;
	}
	
	@PostConstruct
	private void myInit() {
		System.out.println("we are called after constructor");
	}
	
	//Setter injection
	//@Autowired
	public void setRepository(SpeakerRepository repository) {
		System.out.println("SpeakerServiceImpl Setter");
		this.repository = repository;
	}

	public List<Speaker> findAll(){
		return repository.findAll();
	}
		
}
