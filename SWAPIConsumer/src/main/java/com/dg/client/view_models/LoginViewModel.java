package com.dg.client.view_models;

public class LoginViewModel {

	public LoginViewModel() {
		
	}
	
	
	public String username;
	public void setUsername(String value) {
		username = value;
	}
	public String getUsername() {
		return username;
	}
	
	public String password;
	public void setPassword(String value) {
		password = value;
	}
	public String getPassword() {
		return password;
	}
	

	//Actions & Business Logic
	public void resetPassword() {
		
	}
	
	public void beginSignInAuthentication() {
		//login to the backend and retrieve a token from the Identity Server (OAuth)
		
	}
}
