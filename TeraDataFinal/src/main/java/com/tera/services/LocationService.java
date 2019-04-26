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
	

	public Location getByIdLocation()
	{
		Optional<Location> person = locationRepo.findById((long) 8);
		person.get().setAvailability(person.get().getAvailability()*person.get().getAvailability());
		System.out.println("  calling service location , i am getting it  ");
        return person.get()  ;///+crepo.
		
	}
	
	
	
}
