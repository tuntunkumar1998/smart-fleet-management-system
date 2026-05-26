package com.fleet_management.Repogitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleet_management.Entity.Manifest;

public interface ManifestRepository extends JpaRepository<Manifest, Long> {

}
