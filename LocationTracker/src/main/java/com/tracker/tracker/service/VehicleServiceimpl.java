package com.tracker.tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracker.tracker.dao.VehicleDao;
import com.tracker.tracker.entity.Vehicles;

@Service
public class VehicleServiceimpl implements VehicleService{
	
	@Autowired
	VehicleDao vehicleDao;

	@Override
	public List<Vehicles> getVehicle() {
		// TODO Auto-generated method stub
		return vehicleDao.findAll();
	}

	@Override
	public Vehicles addVehicle(Vehicles vehicles) {
		// TODO Auto-generated method stub
		vehicleDao.save(vehicles);
		return vehicles;
	}

	@Override
	public Vehicles updateVehicle(Vehicles vehicle) {
		// TODO Auto-generated method stub
		vehicleDao.save(vehicle);
		return vehicle;
	}

	@Override
	public void deleteVehicle(String vehicleNumber) {
		// TODO Auto-generated method stub
		vehicleDao.delete(vehicleDao.findByNumber(vehicleNumber));
	}

	@Override
	public Vehicles findVehicle(String vehicleNumber) {
		// TODO Auto-generated method stub
		return vehicleDao.findByNumber(vehicleNumber);
	}

	@Override
	public Vehicles updateVehicleStatus(String vehicleNumber) {
		// TODO Auto-generated method stub
		vehicleDao.updateByNumber(vehicleNumber);
		return vehicleDao.findByNumber(vehicleNumber);
	}

}
