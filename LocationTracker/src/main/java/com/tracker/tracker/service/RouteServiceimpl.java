package com.tracker.tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracker.tracker.dao.RouteDao;
import com.tracker.tracker.entity.Route;

@Service
public class RouteServiceimpl  implements RouteService{
	
	@Autowired
	RouteDao routeDao;

	@Override
	public Route addRoute(Route route) {
		// TODO Auto-generated method stub
		return routeDao.save(route);
	}

	@Override
	public Route getRoute(long id) {
		// TODO Auto-generated method stub
		return routeDao.getById(id);
	}
	
	
}
