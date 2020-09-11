package com.punam.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.punam.model.Speaker;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	
	@Value("#{T(java.lang.Math).random()*100}")
	private double seedNum;
	
	public List<Speaker>  findAll(){
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		
		speaker.setFirstName("Punam");
		speaker.setLastName("Jasud");
		speaker.setSeedNum(seedNum);
		
		speakers.add(speaker);
		
		return speakers;
	}
}
