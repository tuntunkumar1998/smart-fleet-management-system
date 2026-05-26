package com.fleet_management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleet_management.Dto.DispatchRequestDTO;
import com.fleet_management.Entity.Dispatch;
import com.fleet_management.service.DispatchService;

@RestController
@RequestMapping("/api/dispatch")
public class DispatchController {

	@Autowired
	private DispatchService service;
	
	  
	    @PostMapping
	    public Dispatch createDispatch(@RequestBody DispatchRequestDTO dto) {

	        return service.createDispatch(dto);
	    }
	
	
	
}
