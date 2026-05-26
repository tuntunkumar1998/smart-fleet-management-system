package com.fleet_management.Repogitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleet_management.Entity.Dispatch;

public interface DispatchRepository extends JpaRepository<Dispatch, Long> {

}
