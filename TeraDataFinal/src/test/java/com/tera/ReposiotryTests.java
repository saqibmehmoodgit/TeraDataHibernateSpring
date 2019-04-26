package com.tera;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tera.model.Location;
import com.tera.repository.LocationRepo;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ReposiotryTests {
	@Autowired
	LocationRepo locRepo;


	@Test
	public void testFindAll() {
		//Iterable<Location> listItem = locRepo.findAll();
		//listItem
		Location loc = new Location();
		loc.setLocationid(1);
		loc.setCostrate(45);
		loc.setAvailability(45);
	
		
		loc.setModifieddate("h2");
		loc.setName("h2");
		locRepo.save(loc);
		Optional<com.tera.model.Location> item = locRepo.findById((long) 1);
//		
		assertEquals("h2",item.get().getName());
		System.out.println(item.get().getName());
		assertEquals(9,9);
	}
	
//	@Test
//	public void testFindOne() {
//		Optional<com.tera.model.Location> item = locRepo.findById((long) 1);
//		
//		assertEquals("h2",item.get().getName());
//	}
}
