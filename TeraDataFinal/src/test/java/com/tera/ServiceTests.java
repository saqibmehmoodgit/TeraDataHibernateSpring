package com.tera;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.tera.model.Location;
import com.tera.repository.LocationRepo;
import com.tera.services.LocationService;


@RunWith(MockitoJUnitRunner.class)
public class ServiceTests {
	@InjectMocks
	private LocationService business;
	@Mock
	private LocationRepo repository;
	@Test
	public void retrieveAllItems_basic() {
		Location location = new Location();
		location.setAvailability(10);
		Optional<Location> locationOptional = Optional.of(location);
		
	when(repository.findById((long) 8)).thenReturn(locationOptional);
Location loc =
	business.getByIdLocation();
	assertEquals(100, loc.getAvailability());
	//assertEquals(400, items.get(1).getValue());
	
	//assertEquals(5, 5);
	
	}
	

}
