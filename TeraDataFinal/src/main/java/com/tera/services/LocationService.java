package com.tera.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tera.model.Location;
import com.tera.repository.LocationRepo;

@Service
public class LocationService {

	
	@Autowired	
	LocationRepo  locationRepo;
	

	public Location getByIdLocation(long id)
	{
		Optional<Location> person = locationRepo.findById((long) id);
		person.get().setAvailability(person.get().getAvailability()*person.get().getAvailability());
	    return person.get()  ;
		
	}
	
	public List<Location> getAllLocation()
	{
	    return locationRepo.getAll();  ;
		
	}
	
	
}
