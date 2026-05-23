package com.fleet_management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fleet_management.Dto.CoordinateDTO;
import com.fleet_management.Dto.RouteResponseDTO;
import com.fleet_management.Util.DistanceUtil;

@Service
public class RouteOptimizationService {

	@Autowired
    private WebClient webClient;
	
	
	public RouteResponseDTO optimizeRoute(List<CoordinateDTO> locations) {
		
		List<CoordinateDTO> optimized = new ArrayList<>();
		
		 CoordinateDTO current = locations.get(0);

		 optimized.add(current);

	       locations.remove(current);
	       
	       double totalDistance = 0;
	       
	       while (!locations.isEmpty()) {

	            CoordinateDTO nearest = null;

	            double minDistance = Double.MAX_VALUE;
	            
	            for (CoordinateDTO location
	                    : locations) {

	                double distance = DistanceUtil.calculateDistance(current,location);

	                if (distance < minDistance) {

	                    minDistance = distance;

	                    nearest = location;
	                }
	            }

	            optimized.add(nearest);

	            locations.remove(nearest);

	            totalDistance += minDistance;

	            current = nearest;
	        }

	        RouteResponseDTO response = new RouteResponseDTO();

	        response.setOptimizedRoute(optimized);

	        response.setTotalDistance(totalDistance);

	        return response;
	       
	}
	
	public String fetchDistanceMatrix(String coordinates) {

	    return webClient.get()
	            .uri("/table/v1/driving/" + coordinates)

	            .retrieve()

	            .bodyToMono(String.class)

	            .block();
	}
	
}
