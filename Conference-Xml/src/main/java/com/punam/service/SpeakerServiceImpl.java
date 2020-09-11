package com.punam.service;

import java.util.List;

import com.punam.model.Speaker;
import com.punam.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository speakerRepository ;
	
	public SpeakerServiceImpl( ) {
		
	}
	
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		this.speakerRepository = speakerRepository;
	}
	
	public void setSpeakerRepository(SpeakerRepository speakerRepository) {
		this.speakerRepository = speakerRepository;
	}


	public List<Speaker> findAll(){
		return speakerRepository.findAll();
	}
		
}
