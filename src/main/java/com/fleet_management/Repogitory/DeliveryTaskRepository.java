package com.fleet_management.Repogitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleet_management.Entity.Route;

public interface DeliveryTaskRepository extends JpaRepository<Route, Long> {

}
