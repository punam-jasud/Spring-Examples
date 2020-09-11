package com.punam.repository;

import java.util.ArrayList;
import java.util.List;

import com.punam.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	
	public List<Speaker>  findAll(){
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		
		speaker.setFirstName("Punam");
		speaker.setLastName("Jasud");
		
		speakers.add(speaker);
		
		return speakers;
	}
}
