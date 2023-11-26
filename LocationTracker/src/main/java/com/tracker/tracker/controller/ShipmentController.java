package com.tracker.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.tracker.entity.Shipments;
import com.tracker.tracker.service.ShipmentService;

@RestController
@RequestMapping("/api/v1/shipments")
public class ShipmentController {
	
	@Autowired
	ShipmentService shipmentService;
	
	@GetMapping("/historyall")
	public List<Shipments> historyAll(){
		return shipmentService.getAllHistory();
	}
	
	@GetMapping("/history/{vehicle}")
	public List<Shipments> history(@PathVariable String vehicle){
		return shipmentService.getHistory(vehicle);
	}
	
	@GetMapping("/currentshipment/{vehicle}")
	public Shipments currentShipment(@PathVariable String vehicle) {
		return shipmentService.getCurrentShipment(vehicle);
	}
	
	@PostMapping("/updateStatus/{shipmentId}/{shipmentStatus}")
	public Shipments updateShipmentStatus(@PathVariable long shipmentId , @PathVariable String shipmentStatus) {
		return shipmentService.updateShipmentStatus(shipmentId, shipmentStatus);
	}
	
	@PutMapping("/addshipment")
	public Shipments addShipment(@RequestBody Shipments shipment) {
		return shipmentService.addShipment(shipment);
	}
}
