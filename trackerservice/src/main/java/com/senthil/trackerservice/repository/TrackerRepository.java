package com.senthil.trackerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senthil.trackerservice.entity.Tracker;

@Repository
public interface TrackerRepository extends JpaRepository<Tracker, Integer> {
	
	

}
