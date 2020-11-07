package com.behl.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {

	@NotBlank(message = "First name cannot be null.")
	private String firstName;
	@NotBlank(message = "Last name cannot be null.")
	private String lastName;

	@Email
	@NotBlank(message = "email cannot be null.")
	private String email;

	@NotBlank(message = "password cannot be null.")
	@Size(min = 4, message = "password should be atleast 4 digits long.")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

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
