package com.tera.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tera.repository.PurchaseOrderHeaderRepo;
import com.tera.repository.SalesOrderHeaderRepo;

@Service
public class PurchaseOrderHeaderService 
{

	@Autowired
	PurchaseOrderHeaderRepo pOHRepo;
	
	public double SumByTotlaDue()
	{
		
		return pOHRepo.SumByFrieghtAmount();
				
	}
	
	
}
