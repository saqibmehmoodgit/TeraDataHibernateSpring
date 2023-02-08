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

	

	@RequestMapping(value = "/all", // ++++
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

 Support for password authentication was removed 
remote: Please see https://docs.github.com for information on currently recommended modes of authentication.

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





url=https://MichaelDrogalis@github.com/derekerdmann/lunch_call.git
to:
url=ssh://git@github.com/derekerdmann/lunch_call.git

url = https://github.com/saqibmehmoodgit/TeraDataHibernateSpring.git

url=ssh://git@github.com/saqibmehmoodgit/TeraDataHibernateSpring.git

