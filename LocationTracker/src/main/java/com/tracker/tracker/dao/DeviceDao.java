package com.tracker.tracker.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tracker.tracker.entity.GpsDevices;

public interface DeviceDao extends JpaRepository<GpsDevices , Long>{
	@Query(value = "select * from devices where number = ?" , nativeQuery = true)
	public GpsDevices getByNumber(long number);
	
	@Query(value = "update devices set active = 'YES' where number = ?" , nativeQuery = true)
	public GpsDevices update(long number);
	
	@Query(value = "select * from devices where active = 'NO'" , nativeQuery = true)
	public List<GpsDevices> getActiveDevices();
	
	
}
