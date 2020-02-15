package com.savant.SpringBootProject.exception;

public class TodoNotFoundException extends RuntimeException {
	
	public TodoNotFoundException(String msg) {
		super(msg);
	}

}
