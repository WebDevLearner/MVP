package com.behl.app.ws.ui.model.request;

import javax.validation.constraints.NotBlank;

public class UserLoginRequestModel {

	@NotBlank(message = "email cannot be blank.")
	private String email;
	
	@NotBlank(message = "password cannot be null.")
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
