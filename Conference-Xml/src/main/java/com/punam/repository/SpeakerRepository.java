package com.punam.repository;

import java.util.List;

import com.punam.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}