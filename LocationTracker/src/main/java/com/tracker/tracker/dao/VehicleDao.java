package com.tracker.tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tracker.tracker.entity.Vehicles;

import jakarta.transaction.Transactional;

public interface VehicleDao extends JpaRepository<Vehicles , String>{
	
	@Query(value = "select * from Vehicles v where v.number = :number" , nativeQuery = true)
	public Vehicles findByNumber(@Param("number")String vehicleNumber);
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "update Vehicles v set v.active = 'Active' where v.number = :number" , nativeQuery = true)
	public void updateByNumber(@Param("number")String vehicleNumber);
}
