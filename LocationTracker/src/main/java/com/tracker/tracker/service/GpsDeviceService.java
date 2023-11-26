package com.tracker.tracker.service;

import java.util.List;

import com.tracker.tracker.entity.GpsDevices;

public interface GpsDeviceService {

	public List<GpsDevices> getDevices();
	public GpsDevices addDevice(GpsDevices gpsDevices);
	public void deleteDevice(long number);
	public GpsDevices  updateStatus(long number);
	public List<GpsDevices> getActive();
	public GpsDevices getLocation(long number);
}
