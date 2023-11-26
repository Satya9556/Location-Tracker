package com.tracker.tracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shipments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String vehicleNumber;
	private long routeId;
	private String status;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public long getRouteId() {
		return routeId;
	}
	public void setRouteId(long routeId) {
		this.routeId = routeId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Shipments(long id, String vehicleNumber, long routeId, String status) {
		super();
		this.id = id;
		this.vehicleNumber = vehicleNumber;
		this.routeId = routeId;
		this.status = status;
	}
	public Shipments() {
		
	}
}
