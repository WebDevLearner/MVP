package com.behl.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class LoginRequestModel {

	@NotBlank(message = "email is a required field.")
	@Email
	private String email;
	
	@NotBlank(message = "password cannot be blank.")
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
