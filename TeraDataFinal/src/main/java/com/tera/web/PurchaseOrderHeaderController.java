package com.tera.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tera.repository.LocationRepo;
import com.tera.repository.VendorRepo;
import com.tera.services.LocationService;
import com.tera.services.PurchaseOrderDetailService;
import com.tera.services.PurchaseOrderHeaderService;

@RestController
@RequestMapping(value = "/pOHControler")
public class PurchaseOrderHeaderController {

	@Autowired
	PurchaseOrderHeaderService  purchaseOrderHeaderService;

	@Autowired
	VendorRepo vendorRepo;
	
	@RequestMapping(value = "/sum", method = RequestMethod.GET) //
	@ResponseBody
	public double sumByTotalFrieght() {
		return  purchaseOrderHeaderService.SumByTotlaDue();
	}

//	@RequestMapping(value = "/prfitmargin", method = RequestMethod.GET) //
//	@ResponseBody
//	public List<Float> sumByTotalFriegt() {
//		return  vendorRepo.profitMargin();
//	}
	
	
	
	
}
