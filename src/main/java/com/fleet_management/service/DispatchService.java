package com.fleet_management.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleet_management.Dto.DispatchRequestDTO;
import com.fleet_management.Entity.Dispatch;
import com.fleet_management.Entity.Driver;
import com.fleet_management.Entity.Route;
import com.fleet_management.Entity.Vehicle;
import com.fleet_management.Repogitory.DispatchRepository;
import com.fleet_management.Repogitory.DriverRepository;
import com.fleet_management.Repogitory.RouteRepository;
import com.fleet_management.Repogitory.VehicleRepository;

@Service
public class DispatchService {

	
	@Autowired
	 private DriverRepository driverRepository;
	
	@Autowired
	 private VehicleRepository vehicleRepository;
	
	@Autowired
	private RouteRepository routeRepository;
	
	@Autowired
	private DispatchRepository dispatchRepository;

	
	public Dispatch createDispatch(DispatchRequestDTO dto) {
		
		Driver driver = driverRepository.findById(dto.getDriverId()).orElseThrow();
          
		Vehicle vehicle = vehicleRepository.findById(dto.getVehicleId()).orElseThrow();
		
		Route route =  routeRepository.findById(dto.getRouteId()).orElseThrow();
		
		
		Dispatch dispatch =  new Dispatch();
		
		dispatch.setDriver(driver);
		
		dispatch.setVehicle(vehicle);
		
		dispatch.setRoute(route);
		
		dispatch.setDispatchDate(LocalDate.now());
		
		
		return dispatchRepository.save(dispatch);
	}
	
}
