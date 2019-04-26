package com.tera.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tera.model.PurchaseOrderDetail;
import com.tera.repository.LocationRepo;
import com.tera.services.LocationService;
import com.tera.services.PurchaseOrderDetailService;
import com.tera.services.SalesOrderHeaderService;

@RestController
@RequestMapping(value = "/podCont")
public class PurchaseOrderDetialContrlr {

	@Autowired
	PurchaseOrderDetailService  purchaseOrderDetailService;

	@Autowired	
	SalesOrderHeaderService salesOrderHeaderService;

	@RequestMapping(value = "/rejectedPOD", method = RequestMethod.GET) //
	@ResponseBody
	public PurchaseOrderDetail PurchaseOrderDetailTopRejected() {
		///System.out.print(" total due " +salesOrderHeaderService.SumByTotlaDue());
		return	purchaseOrderDetailService.findHighestOrderDetailByRejectedQty();
		  
	}

	
	
}
