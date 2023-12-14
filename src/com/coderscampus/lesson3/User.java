package com.coderscampus.lesson3;

// POJO = Plain Old Java Object
public class User {
	
	// instance variables (declared as private)
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String unsuccessfulLoginAttempts;
	
	
	// Getters & Setters for the above instance variables
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	public String getUnsuccessfulLoginAttempts() {
		return unsuccessfulLoginAttempts;
	}
	public void setUnsuccessfulLoginAttempts(String unsuccessfulLoginAttempts) {
		this.unsuccessfulLoginAttempts = unsuccessfulLoginAttempts;
	}
	
}
