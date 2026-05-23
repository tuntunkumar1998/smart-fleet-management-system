package com.fleet_management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet_management.Dto.RouteRequestDTO;
import com.fleet_management.Dto.RouteResponseDTO;
import com.fleet_management.service.RouteOptimizationService;

@RestController
@RequestMapping("/api/routes")
public class RouteController {

	@Autowired
    private RouteOptimizationService service;
	
	@PostMapping("/optimize")
	 public RouteResponseDTO optimizeRoute(@RequestBody RouteRequestDTO request) {

	        return service.optimizeRoute(request.getLocations());
	    }
	
}
