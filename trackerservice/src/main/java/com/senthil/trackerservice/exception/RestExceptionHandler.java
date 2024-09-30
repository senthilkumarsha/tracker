package com.senthil.trackerservice.exception;

import java.util.NoSuchElementException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<Object> handleNoSuchElementException(HttpServletRequest request,NoSuchElementException ex)
	{
		
		
		return buildResponseEntity(new ErrorResponse(HttpStatus.BAD_REQUEST,ex.getMessage()));
		
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<Object> handleNoSuchElementException(HttpServletRequest request,DataIntegrityViolationException ex)
	{
		
		
		return buildResponseEntity(new ErrorResponse(HttpStatus.BAD_REQUEST,ex.getMessage()));
		
	}
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> handleTrackerException(HttpServletRequest request,IdNotFoundException ex)
	{
		
		return buildResponseEntity(new ErrorResponse(HttpStatus.BAD_REQUEST,ex.getMessage()));
		
	}
	
	private ResponseEntity<Object> buildResponseEntity(ErrorResponse errorResponse)
	{
		return new ResponseEntity<Object>(errorResponse,errorResponse.getHttpStatus());
	}

}
