package com.tera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tera.model.SalesOrderHeader;
import com.tera.model.Vendor;

	@Repository
	public interface SalesOrderHeaderRepo extends PagingAndSortingRepository<SalesOrderHeader, Long>
	{ 


	    /*@Query("SELECT sum(totaldue) from SalesOrderHeader ")
	    double SumTotlaDue();
	    @Modifying
	    */
	    @Query(value="select sum(soh.totaldue)  from SalesOrderHeader soh",nativeQuery=true)
	    double sumtotladue();
	     
		}
