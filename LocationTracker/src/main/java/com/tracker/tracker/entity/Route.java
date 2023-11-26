package com.tracker.tracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String startingLocation;
	String finalLocation;
	double initialLatitude;
	double initialLongitude;
	double finalLatitude;
	double finalLongitude;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getStartingLocation() {
		return startingLocation;
	}
	public void setStartingLocation(String startingLocation) {
		this.startingLocation = startingLocation;
	}
	public String getFinalLocation() {
		return finalLocation;
	}
	public void setFinalLocation(String finalLocation) {
		this.finalLocation = finalLocation;
	}
	public double getInitialLatitude() {
		return initialLatitude;
	}
	public void setInitialLatitude(float initialLatitude) {
		this.initialLatitude = initialLatitude;
	}
	public double getInitialLongitude() {
		return initialLongitude;
	}
	public void setInitialLongitude(float initialLongitude) {
		this.initialLongitude = initialLongitude;
	}
	public double getFinalLatitude() {
		return finalLatitude;
	}
	public void setFinalLatitude(float finalLatitude) {
		this.finalLatitude = finalLatitude;
	}
	public double getFinalLongitude() {
		return finalLongitude;
	}
	public void setFinalLongitude(float finalLongitude) {
		this.finalLongitude = finalLongitude;
	}
	public Route(long id, String starting, String destinationName, double initialLatitude, double initialLongitude,
			double finalLatitude, double finalLongitude) {
		super();
		this.id = id;
		this.startingLocation = starting;
		this.finalLocation = destinationName;
		this.initialLatitude = initialLatitude;
		this.initialLongitude = initialLongitude;
		this.finalLatitude = finalLatitude;
		this.finalLongitude = finalLongitude;
	}
	public Route() {
		
	}
	
}
