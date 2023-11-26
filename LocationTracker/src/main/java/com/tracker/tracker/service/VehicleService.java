package com.tracker.tracker.service;

import java.util.List;

import com.tracker.tracker.entity.Vehicles;

public interface VehicleService {
	
	public List<Vehicles> getVehicle();
	public Vehicles addVehicle(Vehicles vehicles);
	public Vehicles updateVehicle(Vehicles vehicle);
	public Vehicles updateVehicleStatus(String vehicleNumber);
	public Vehicles findVehicle(String vehicleNumber);
	public void deleteVehicle(String vehicleNumber);
}
