package com.senthil.trackerservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senthil.trackerservice.entity.Tracker;
import com.senthil.trackerservice.exception.IdNotFoundException;
import com.senthil.trackerservice.service.TrackerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/tracker")
public class TrackerController {
	
	Logger logger = LoggerFactory.getLogger(TrackerController.class);
	
	@Autowired
	private TrackerService trackerService;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Tracker>> getTrackerAll() {
		List<Tracker> trackerList = trackerService.getAllTracker();
		return new ResponseEntity<>(trackerList,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public Tracker getTracker(@PathVariable int id) throws IdNotFoundException {
		
			return trackerService.getTracker(id);
		
	}

	
	
	@PostMapping("/save")
	public ResponseEntity<Tracker> saveTracker(@RequestBody Tracker tracker) {
		//TODO: process POST request
		
	  Tracker savedTracker = trackerService.saveTracker(tracker);
	  return new ResponseEntity<>(savedTracker,HttpStatus.CREATED);
	}
	
	
	
	

}
