package com.fleet_management.Repogitory;


import org.springframework.data.jpa.repository.JpaRepository;

import com.fleet_management.Entity.DeliveryTask;

public interface DeliveryTaskRepository extends JpaRepository<DeliveryTask, Long> {

	 

}
