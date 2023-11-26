package com.tracker.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.tracker.entity.Vehicles;
import com.tracker.tracker.service.VehicleService;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehiclesController {
	
	@Autowired
	VehicleService vehicleService;
	
	@GetMapping("/getvehicles")
	public List<Vehicles> getVehicles(){
		return vehicleService.getVehicle();
	}
	
	@PostMapping("/addvehicle")
	public Vehicles addVehicles(@RequestBody Vehicles vehicles) {
		return vehicleService.addVehicle(vehicles);
	}
	
	@PutMapping("/updatevehiclestatus/{vehicleNumber}")
	public Vehicles updateVehicleStatus(@PathVariable String vehicleNumber) {
		return vehicleService.updateVehicleStatus(vehicleNumber);
	}
	
	@PutMapping("/updatevehicles")
	public Vehicles updateVehicles(@RequestBody Vehicles vehicles) {
		return vehicleService.updateVehicle(vehicles);
	}
	
	@DeleteMapping("/deletevehicle/{vehicleNumber}")
	public void deleteVehicle(@PathVariable String vehicleNumber) {
		vehicleService.deleteVehicle(vehicleNumber);
	}
}
