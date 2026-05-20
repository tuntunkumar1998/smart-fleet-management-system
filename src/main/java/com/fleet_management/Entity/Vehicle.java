package com.fleet_management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "vehicles")
public class Vehicle {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	    private String vehicleNumber;

	    private String vehicleType;

	    private Double capacity;

	    private String fuelType;

	    private String maintenanceStatus;

	    private Boolean available;

	    @ManyToOne
	    @JoinColumn(name = "driver_id")
	    private Driver driver;
	    
	    public Vehicle() {
	    }

		 
	
}
