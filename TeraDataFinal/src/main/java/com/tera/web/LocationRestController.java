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

	

	@RequestMapping(value = "/all", //
			method = RequestMethod.GET) //
	// @ResponseBody
	public String hellow() {

		return "ALLAH KAREEM";/// +crepo.
	}

	@RequestMapping(value = "/location", //
			method = RequestMethod.GET) //
	@ResponseBody
	public Location person() {
		return locationService.getByIdLocation();
	}

	/// crepo.
//	
//	
	// System.out.println(" finding values is " + person1.getFirstname());

}
