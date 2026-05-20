package com.fleet_management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet_management.Entity.Vehicle;
import com.fleet_management.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

	@Autowired
    private VehicleService service;
	
	
	@PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {

        return service.saveVehicle(vehicle);
	}
	
	
	public List<Vehicle> getvehicle(){
		
		return service.getAllVehicles();
	}
	
	@PutMapping("/{vehicleId}/assign/{driverId}")
	public Vehicle assignDriver(@PathVariable Long vehicleId,
			                    @PathVariable("driverId") Long DriverId) {
		
		return service.assignDriver(
                vehicleId,
                DriverId);
		
	}
	
	
	
}
