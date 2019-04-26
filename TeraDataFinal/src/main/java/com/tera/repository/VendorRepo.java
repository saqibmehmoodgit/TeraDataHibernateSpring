package com.tera.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tera.model.Vendor;

	@Repository
	public interface VendorRepo extends PagingAndSortingRepository<Vendor, Long>
	{ 


///		Vendor findTopByOrderByRejectedqtyDesc();	
		
		
		///-StandardCost   
		
		 @Query(value="select (ListPrice-StandardCost) as ProfitMargin from Dice_RDM.Product QUALIFY RANK() OVER (order by   (ListPrice-StandardCost) desc ) BETWEEN :startFrom and :endWith",nativeQuery=true)

		    public List<Float> profitMargin(@Param("startFrom") int startFrom ,@Param("endWith") int endWith);
		 
		 
		 
		 /////SELECT	 Name, CreditRating 	 FROM Dice_RDM.Vendor  order by CreditRating desc
		  @Query(value="select v.name, v.creditrating  from Vendor v order by v.creditrating desc" , nativeQuery=true)
		  List<String[]> findByNameCreditratingAndSort( );
		 
		 


}
