package com.tera.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.tera.repository.VendorRepo;

@Service
public class VendorService 
{

	 @Autowired
	 VendorRepo vendorRepo;
	 
	 
	    public List<Float> profitMargin()
	    {
	    	return vendorRepo.profitMargin(10,15);
	    }
	 
	 
	  public List<String[]> findByNameCreditratingAndSort( )
	  {
		  
		 return  vendorRepo.findByNameCreditratingAndSort();
	  }
	 	
	
	
}
