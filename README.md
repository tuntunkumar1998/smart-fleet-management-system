 Fleet Schema Design and Database Initialization

During Week 1, the Fleet Management project focuses on backend foundation setup. The relational schema is designed in MySQL and integrated with the Spring Boot application using Spring Data JPA.

Core entities including Driver, Vehicle, DeliveryTask, and Route are implemented with proper entity relationships and database mappings. Data Access Objects (DAOs) are developed using JpaRepository interfaces to support CRUD operations.

RESTful APIs are created for:

* Registering new vehicles
* Creating drivers
* Assigning drivers to vehicles
* Managing fleet records

The backend configuration includes MySQL datasource setup, Hibernate JPA configuration, and layered architecture implementation using Controller, Service, Repository, and Entity packages.
