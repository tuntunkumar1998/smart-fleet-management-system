package com.fleet_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fleet_management.Entity.DeliveryStatus;
import com.fleet_management.Entity.DeliveryTask;
import com.fleet_management.Entity.Dispatch;
import com.fleet_management.Entity.Manifest;
import com.fleet_management.Repogitory.DeliveryTaskRepository;
import com.fleet_management.Repogitory.ManifestRepository;

@Service
public class ManifestService {

	
	@Autowired
	private ManifestRepository manifestRepository;
	
	
	@Autowired
	private DeliveryTaskRepository taskRepository;
	
	
	public Manifest generateManifest(Dispatch dispatch , List<DeliveryTask> tasks) {
		
		for(DeliveryTask task : tasks) {
			
			 task.setStatus(DeliveryStatus.DISPATCHED);
			
		}
		
		taskRepository.saveAll(tasks);
		
		 Manifest manifest = new Manifest();
		
		 manifest.setDispatch(dispatch);
		 
		 manifest.setTasks(tasks);
		 
		 
		return manifestRepository.save(manifest);
	}
	
	
}
