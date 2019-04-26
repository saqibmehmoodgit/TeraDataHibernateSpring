package com.tera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.tera.model.Location;

@Repository
public interface LocationRepo extends PagingAndSortingRepository<Location, Long>{ 


}
