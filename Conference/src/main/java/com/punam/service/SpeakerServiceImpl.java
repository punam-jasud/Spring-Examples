package com.punam.service;

import java.util.List;

import com.punam.model.Speaker;
import com.punam.repository.HibernateSpeakerRepositoryImpl;
import com.punam.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
	
	public List<Speaker> findAll(){
		return repository.findAll();
	}
		
}
