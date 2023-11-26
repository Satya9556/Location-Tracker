package com.tracker.tracker.service;

import java.util.List;

import com.tracker.tracker.entity.Shipments;

public interface ShipmentService {
	
	
	public List<Shipments> getAllHistory();
	public List<Shipments> getHistory(String vehicleNUmber);
	public Shipments getCurrentShipment(String vehicleNumber);
	public Shipments addShipment(Shipments shipment);
	public Shipments updateShipmentStatus(long shipmentId , String shipmentStatus);
}
