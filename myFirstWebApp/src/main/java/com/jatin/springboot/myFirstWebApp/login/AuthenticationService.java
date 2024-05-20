package com.jatin.springboot.myFirstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isvalidUsername = username.equalsIgnoreCase("jatin yadav");
		boolean isvalidPassword = password.equalsIgnoreCase("jatinyyadav");
		
		return isvalidPassword && isvalidUsername;
	}
}
