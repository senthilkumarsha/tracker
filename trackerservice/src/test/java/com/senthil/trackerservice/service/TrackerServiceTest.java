package com.senthil.trackerservice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.senthil.trackerservice.entity.Tracker;
import com.senthil.trackerservice.exception.IdNotFoundException;
import com.senthil.trackerservice.repository.TrackerRepository;


@SpringBootTest
public class TrackerServiceTest {
	
	@InjectMocks
	TrackerService trackerService;
	
	@Mock
	TrackerRepository trackerRepository;
	
	
	@Test
	public void getTrackerTest() throws IdNotFoundException 
	{
		Optional<Tracker> trackerStub = createTrackerStub();
		when(trackerRepository.findById(1)).thenReturn(trackerStub);		
		Tracker t = trackerService.getTracker(1);
		assertEquals(t, trackerStub.get());		
	}
	
	private Optional<Tracker> createTrackerStub()
	{
		Tracker t = new Tracker();
		t.setId(1);
		t.setDevice_id("test");
		t.setLattitude("123.1232");
		t.setLongitude("123.1232");
		t.setCreatedon(new Date());
		return Optional.of(t);
		
	}

}
