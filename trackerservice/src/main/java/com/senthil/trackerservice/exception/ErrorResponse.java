package com.senthil.trackerservice.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.Data;

@Data
public class ErrorResponse {

	public ErrorResponse() {
		this.timeStamp = LocalDateTime.now();
	}
	public ErrorResponse(HttpStatus httpStatus, LocalDateTime timeStamp, String message) {
	
		this.httpStatus = httpStatus;
		this.timeStamp = timeStamp;
		this.message = message;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public ErrorResponse(HttpStatus httpStatus, String message) {
		this();
		this.httpStatus = httpStatus;
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private HttpStatus httpStatus;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd hh:mm:ss")
	private LocalDateTime timeStamp;
	private String message;
	
}
