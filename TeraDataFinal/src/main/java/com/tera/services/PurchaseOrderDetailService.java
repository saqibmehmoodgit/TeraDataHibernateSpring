package com.tera.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tera.model.PurchaseOrderDetail;
import com.tera.repository.PurchaseOrderDetailRepo;

@Service
public class PurchaseOrderDetailService 
{

	@Autowired
	PurchaseOrderDetailRepo pORepo;
	
	
	     public PurchaseOrderDetail  	findHighestOrderDetailByRejectedQty()
			{
		
	//	return pORepo.findHighestOrderDetailByRejectedQty();
	    	return pORepo.findTopByOrderByRejectedqtyDesc();
			}
	
}
