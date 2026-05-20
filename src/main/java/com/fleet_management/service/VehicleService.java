package com.fleet_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleet_management.Entity.Driver;
import com.fleet_management.Entity.Vehicle;
import com.fleet_management.Repogitory.DriverRepository;
import com.fleet_management.Repogitory.VehicleRepository;

@Service
public class VehicleService {

	
	 @Autowired
	    private VehicleRepository
	            vehicleRepository;

	    @Autowired
	    private DriverRepository
	            driverRepository;
	    
	    
	    
	    public Vehicle saveVehicle(Vehicle vehicle) {

	        return vehicleRepository.save(vehicle);
	    }
	    
	    
	    public List<Vehicle> getAllVehicles() {

	        return vehicleRepository.findAll();
	    }
	    
	    
	    public Vehicle assignDriver(Long vehicleId,Long driverId) {
	    	
	    	Vehicle vehicle = vehicleRepository.findById(vehicleId).orElseThrow();
	    	
	    	 Driver driver =  driverRepository.findById(driverId).orElseThrow();
	    	 
	    	 vehicle.setDriver(driver);
	    	 
	    	return vehicleRepository.save(vehicle);
	    }
	
}
