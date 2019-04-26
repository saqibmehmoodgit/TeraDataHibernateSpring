package com.tera.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tera.repository.SalesOrderHeaderRepo;

@Service
public class SalesOrderHeaderService 
{

	@Autowired
	SalesOrderHeaderRepo  sOHRepo;
	
public	double SumByTotlaDue()
{

	return sOHRepo.sumtotladue();
}
	
	
}
