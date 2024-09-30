package com.senthil.trackerservice.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senthil.trackerservice.entity.Tracker;
import com.senthil.trackerservice.exception.IdNotFoundException;
import com.senthil.trackerservice.repository.TrackerRepository;

@Service
public class TrackerService {
	
	Logger logger = LoggerFactory.getLogger(TrackerService.class);
	
	@Autowired
	private TrackerRepository trackerRepository;

	public List<Tracker> getAllTracker() {
		// TODO Auto-generated method stub
		return trackerRepository.findAll();
	}

	public Tracker saveTracker(Tracker tracker) {
		
		logger.info("Save Tracker :" + tracker.toString());
		return trackerRepository.save(tracker);
		
	}

	public Tracker getTracker(int id) throws IdNotFoundException{
		// TODO Auto-generated method stub
		Optional<Tracker> t = trackerRepository.findById(id);
		String s = "Tracker Id{} not present";
		if(t.isEmpty()) throw new IdNotFoundException(s);		
		return t.get();
		
	}

}
