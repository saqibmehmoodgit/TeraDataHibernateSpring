package com.tera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tera.model.Location;
import com.tera.model.PurchaseOrderDetail;
import com.tera.model.PurchaseOrderHeader;


@Repository
public interface PurchaseOrderHeaderRepo extends PagingAndSortingRepository<PurchaseOrderHeader, Long>{ 

	@Modifying
    @Query(value="select sum(freight)  from PurchaseOrderHeader", nativeQuery = true)
    double SumByFrieghtAmount();
    
    
}
