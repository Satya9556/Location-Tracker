package com.tracker.tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracker.tracker.dao.DeviceDao;
import com.tracker.tracker.entity.GpsDevices;

@Service
public class GpsDeviceServiceimpl implements GpsDeviceService {
	
	@Autowired
	DeviceDao deviceDao;

	@Override
	public List<GpsDevices> getDevices() {
		// TODO Auto-generated method stub
		return deviceDao.findAll();
	}

	@Override
	public GpsDevices addDevice(GpsDevices gpsDevices) {
		// TODO Auto-generated method stub
		deviceDao.save(gpsDevices);
		return gpsDevices;
	}

	@Override
	public void deleteDevice(long number) {
		// TODO Auto-generated method stub
		
		deviceDao.delete(deviceDao.getByNumber(number));
	}

	@Override
	public GpsDevices updateStatus(long number) {
		// TODO Auto-generated method stub
		
		return deviceDao.update(number);
	}

	@Override
	public List<GpsDevices> getActive() {
		// TODO Auto-generated method stub
		return deviceDao.getActiveDevices();
	}

	@Override
	public GpsDevices getLocation(long number) {
		// TODO Auto-generated method stub
		return deviceDao.getByNumber(number);
	}

}
