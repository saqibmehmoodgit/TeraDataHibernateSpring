package com.tera.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tera.model.PurchaseOrderDetail;
import com.tera.services.PurchaseOrderDetailService;
import com.tera.services.SalesOrderHeaderService;
import com.tera.services.VendorService;

@RestController
@RequestMapping(value = "/vendorCont")
public class VendorRestController {
	@Autowired	
	VendorService vendorService;

	
	@RequestMapping(value = "/profitMargin", method = RequestMethod.GET) //
	@ResponseBody
	
	  public List<Float> profitMargin()
	    {
	    	return vendorService.profitMargin();
	    }
	 
	@RequestMapping(value = "/nameCradit", method = RequestMethod.GET) //
	@ResponseBody
	 
	  List<String[]> findByNameCreditratingAndSort( )
	  {
		  
		 return  vendorService.findByNameCreditratingAndSort();
	  }
	
}