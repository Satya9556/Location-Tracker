package com.tracker.tracker.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tracker.tracker.entity.Shipments;

import jakarta.transaction.Transactional;

public interface ShipmentDao extends JpaRepository<Shipments , Long>{
	
	@Query(value = "select * from shipments s where s.vehicle_umber = ?" , nativeQuery = true)
	public List<Shipments> getVehicleShipments(String vehicleNumber);
	
	@Query(value = "select * from shipments s where s.vehicle_number = ? and s.status = 'Running'" , nativeQuery = true )
	public Shipments getCurrentShipment(String vehicleNumber);
	
	
	@Query(value = "select * from shipments s where s.id = ?" , nativeQuery = true)
	public Shipments getShipmentsById(long shipmentId);
	
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "update shipments s set s.status = :status where s.id = :number " , nativeQuery = true)
	public void updateShipmentStatus(@Param("number")long shipmentId , @Param("status")String shipmentStatus);
	
	
}
