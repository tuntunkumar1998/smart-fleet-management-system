package com.fleet_management.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fleet_management.exception.ApiRateLimitException;
import com.fleet_management.exception.InvalidAddressException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	
	 @ExceptionHandler(InvalidAddressException.class)
	 
	 
	 public ResponseEntity<String> handleInvalidAddress (InvalidAddressException ex) {

                 return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
           }
	 
	 
	 @ExceptionHandler(ApiRateLimitException.class)

	    public ResponseEntity<String> handleRateLimit(ApiRateLimitException ex) {

	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.TOO_MANY_REQUESTS);
	    }
	
	 
	 @ExceptionHandler(Exception.class)

	    public ResponseEntity<String> handleGlobalException( Exception ex) {

	        return new ResponseEntity<>( ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	        
	    }
}
