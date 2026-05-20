package com.fleet_management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name  = "drivers")
public class Driver {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

    private String driverName;

    private String phoneNumber;

    private String licenseNumber;

    private Integer shiftHours;

    private Boolean available;
	
}
