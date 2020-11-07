package com.behl.app.ws.exceptions;

public class UserServiceException extends RuntimeException {

	private static final long serialVersionUID = -7688086955514640520L;

	public UserServiceException(String message) {
		super(message);
	}
}
