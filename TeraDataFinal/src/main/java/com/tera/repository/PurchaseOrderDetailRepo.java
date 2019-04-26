package com.tera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tera.model.PurchaseOrderDetail;

@Repository
public interface PurchaseOrderDetailRepo extends PagingAndSortingRepository<PurchaseOrderDetail, Long>{ 

    @Query(nativeQuery = true, value = "SELECT Top 1  FROM PurchaseOrderDetail pod ORDER BY pod.rejectedqty DESC")
    PurchaseOrderDetail  findHighestOrderDetailByRejectedQty();
    
    PurchaseOrderDetail findTopByOrderByRejectedqtyDesc();
	/*
    @Query("select  from PurchaseOrderDetail d where d.filterCol = ?1")
List<PurchaseOrderDetail> findDocumentsForListing(String filterValue);
*/    
    
    ///PurchaseOrderDetail findCommandStatusByVinOrderByCreatedTimestampDesc(@Param("vin") String vin);

}
