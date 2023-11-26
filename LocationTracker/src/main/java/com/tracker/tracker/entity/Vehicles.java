package com.tracker.tracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicles")
public class Vehicles {
	
	@Id
	@Column(name = "number")
	private String vehicleNumber;
	
	
	private long gpsNumber;
	private String vehicleType;
	private String active;
	
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public long getGpsNumber() {
		return gpsNumber;
	}
	public void setGpsNumber(long gpsNumber) {
		this.gpsNumber = gpsNumber;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public Vehicles(String vehicleNumber, long gpsNumber, String vehicleType , String active) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.gpsNumber = gpsNumber;
		this.vehicleType = vehicleType;
		this.active = active;
	}
	public Vehicles() {
		
	}
	
}
