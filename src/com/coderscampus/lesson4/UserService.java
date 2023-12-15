package com.coderscampus.lesson4;

import com.coderscampus.lesson3.User;

public class UserService {
	
//	public User createUser (String username, String password, String name) {
//		User user = new User();
//		user.setUsername(username);
//		user.setPassword(password);
//		user.setname(name);
//		return user;
//	}
	
	public String[] parseText(String input) {
		String[] stringArray = input.split(",");
		input = "exampleUsername,examplePassword,exampleName";
		return stringArray;
		
		
	}
	
//	public User createUser (String[] stringInput) {
//		String username = stringInput[0];
//		String password = stringInput[1];
//		String name = stringInput[2];
//		
//	User user = new User(username, password, name);
//			
//	stringInput[0] = "aUserNameHere";
//	stringInput[1] = "aPasswordHere";
//	stringInput[2] = "somebodiesName";
//	
//	return user;
//	}	
}	
