package com.tracker.tracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "devices")
public class GpsDevices {
	
	@Id
	@Column(unique = true)
	private long number;
	private double latitude;
	private double longitude;
	private String active;
	
	public long getnumber() {
		return number;
	}
	public void setnumber(long number) {
		this.number = number;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public GpsDevices(long number, double latitude, double longitude , String isActive) {
		super();
		this.number = number;
		this.latitude = latitude;
		this.longitude = longitude;
		this.active = isActive;
	}
	public GpsDevices() {
		
	}
	
	
}
