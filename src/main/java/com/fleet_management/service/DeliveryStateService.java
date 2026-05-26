package com.fleet_management.service;

import org.springframework.stereotype.Service;

import com.fleet_management.Entity.DeliveryStatus;
import com.fleet_management.Entity.DeliveryTask;

@Service
public class DeliveryStateService {

	
	 public DeliveryTask updateStatus(DeliveryTask task, DeliveryStatus status) {
		 
		        if(task.getStatus() == DeliveryStatus.DELIVERED) {

	                   throw new RuntimeException( "Task already delivered");
	             }
		 
		      task.setStatus(status);
		 
		      
		    return task;
	 }
	
	
	
}
