package com.tera.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tera.model.Location;
import com.tera.repository.LocationRepo;
import com.tera.services.LocationService;
import com.tera.services.PurchaseOrderDetailService;

@RestController
@RequestMapping(value = "/tera")
public class LocationRestController {

	@Autowired
	LocationRepo locationRepo;
	@Autowired
	LocationService locationService;
	@Autowired
	PurchaseOrderDetailService  purchaseOrderDetailService;

	

	@RequestMapping(value = "/allLocations", 
			method = RequestMethod.GET) //
	public List<Location> getAllLocation() {
    
		return locationService.getAllLocation();/// 
	}

	@RequestMapping(value = "/location/{id}", //
			method = RequestMethod.GET) //
	@ResponseBody
	public Location person(@RequestParameter int id) {
		return locationService.getByIdLocation();
	}


