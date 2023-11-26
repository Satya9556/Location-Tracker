package com.tracker.tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracker.tracker.dao.ShipmentDao;
import com.tracker.tracker.entity.Shipments;

@Service
public class ShipmentServiceimpl implements ShipmentService{
	
	@Autowired
	ShipmentDao shipmentDao;

	@Override
	public List<Shipments> getAllHistory() {
		// TODO Auto-generated method stub
		return shipmentDao.findAll();
	}

	@Override
	public List<Shipments> getHistory(String vehicleNumber) {
		// TODO Auto-generated method stub
		return shipmentDao.getVehicleShipments(vehicleNumber);
	}

	@Override
	public Shipments getCurrentShipment(String vehicleNUmber) {
		// TODO Auto-generated method stub
		return shipmentDao.getCurrentShipment(vehicleNUmber);
	}

	@Override
	public Shipments addShipment(Shipments shipment) {
		// TODO Auto-generated method stub
		return shipmentDao.save(shipment);
	}

	@Override
	public Shipments updateShipmentStatus(long shipmentId, String shipmentStatus) {
		// TODO Auto-generated method stub
		shipmentDao.updateShipmentStatus(shipmentId, shipmentStatus);
		return shipmentDao.getShipmentsById(shipmentId);
	}
	
}
