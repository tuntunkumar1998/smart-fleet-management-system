package com.fleet_management.Repogitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleet_management.Entity.Route;

public interface RouteRepository extends JpaRepository<Route, Long> {

}
