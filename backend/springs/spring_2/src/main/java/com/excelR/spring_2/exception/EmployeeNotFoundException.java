package com.excelR.spring_2.exception;

public class EmployeeNotFoundException extends RuntimeException {
	private String message;
	
	@Override
	public String getMessage() {
		return message;
	}

	public EmployeeNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	

}
