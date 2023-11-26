package com.tracker.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.tracker.entity.GpsDevices;
import com.tracker.tracker.service.GpsDeviceService;

@RestController
@RequestMapping("/api/v1/devices")
public class GpsDevicesController {
	
	
	@Autowired
	private GpsDeviceService gpsDeviceService;
	
	@GetMapping("/getdevices")
	public List<GpsDevices> getDevices(){
		return gpsDeviceService.getDevices();
	}
	@GetMapping("/getlocation/{number}")
	public GpsDevices getdetail(@PathVariable long number) {
		return gpsDeviceService.getLocation(number);
	}
	
	@GetMapping("/getactive")
	public List<GpsDevices> getActiveDevices(){
		return gpsDeviceService.getActive();
	}
	
	@PutMapping("/adddevice/{number}/{latitude}/{longitude}")
	public GpsDevices addDevice(@PathVariable long number , @PathVariable double latitude , @PathVariable double longitude) {
		GpsDevices device = new GpsDevices(number , latitude , longitude , "NO");
		return gpsDeviceService.addDevice(device);
		
	}
	
	@DeleteMapping("/deletedevice/{number}")
	public GpsDevices deleteDevice(@PathVariable long number) {
		return null;
		
	}
	
}
