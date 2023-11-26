package com.tracker.tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tracker.tracker.entity.Route;

public interface RouteDao extends JpaRepository<Route , Long>{

	
	@Query(value="Select * from route where id = ?" , nativeQuery = true)
	public Route getById(long id);
}	
