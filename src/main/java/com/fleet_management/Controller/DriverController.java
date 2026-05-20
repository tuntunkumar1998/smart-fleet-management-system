package com.fleet_management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet_management.Entity.Driver;
import com.fleet_management.Repogitory.DriverRepository;

@RestController
@RequestMapping("/api/drivers")
public class DriverController {

	@Autowired
    private DriverRepository repository;
	
	 @PostMapping
	    public Driver createDriver(@RequestBody Driver driver) {

	        return repository.save(driver);
	 }
	 
	 
	 @GetMapping
	    public List<Driver> getDrivers() {

	        return repository.findAll();
	    }
}
