package com.tracker.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.tracker.entity.Route;
import com.tracker.tracker.service.RouteService;

@RestController
@RequestMapping("api/v1/routes")
public class RoutesController {
	
	@Autowired
	RouteService routeService;
	
	@GetMapping("/getroute/{id}")
	public Route getRoute(@PathVariable long id) {
		return routeService.getRoute(id);
	}
	
	@PostMapping("/addroute")
	public Route addRoute(@RequestBody Route route) {
		return routeService.addRoute(route);
	}
}
