package com.fleet_management.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dispatch")
public class Dispatch {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @OneToOne
    private Driver driver;

    @OneToOne
    private Vehicle vehicle;

    @OneToOne
    private Route route;

    private LocalDate dispatchDate;
	
}
