package com.fleet_management.Repogitory;

 

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleet_management.Entity.Driver;
 

public interface DriverRepository extends JpaRepository<Driver, Long> {

}
