package com.bookshop;

import java.util.ArrayList;

public class UserManager {
	/*
	 * Create array list for user details.
	 */
	public static ArrayList<User> userList = new ArrayList<User>();
	/**
	 * This method helps to add user details.
	 * user details 
	 * Name
	 * Email Id
	 * Mobile Number
	 * Password
	 * Date of Birth
	 */
	public static void addNewUser() {
		
		User user1 = new User();
		user1.name = "R";
		user1.email="rathikagmail.com";
		user1.mobileNumber=3;
		user1.password="pa1";
		
		//System.out.println("Name:  " + user1.name + "  Email: "+user1.email + "  Mobile Number:  " + user1.mobileNumber +"  Stage:  " +user1.stage + "  DOB:  " + user1.DOB);
		User user2 = new User();
		user2.name="n";
		user2.email="nilmail.com";
		user2.mobileNumber = 808080L;
		user2.password="s12";
		
		//System.out.println("Name:  " + user2.name + "  Email: "+user2.email + "  Mobile Number:  " + user2.mobileNumber +"  Stage:  " +user2.stage + "  DOB:  " + user2.DOB);
		User user3 = new User();
		user3.name = "ezhil";
		user3.email = "ezhil@gmail.com";
		user3.password = "pass123";
		user3.mobileNumber = 7070707070L;
	
		
		//Adding user details into array list.
		
		userList.add(user1);
		UserDetailValidation.addUserDetails(userList);
		userList.add(user2);
		UserDetailValidation.addUserDetails(userList);
		userList.add(user3); 
		UserDetailValidation.addUserDetails(userList);

	}
	/**
	 * Display the added user details by passing array list.
	 * @param userList
	 */
			
		
	public static  void displayUserDetails(ArrayList<User> userList) {
		int i=1;
		
	      for (User user : userList) 
	      { 
	    	System.out.println("USER "+ i);  
	        System.out.println("NAME: "+user.name);
	        System.out.println("EMAIL: "+user.email);
	        System.out.println("MOBILE NUMBER: "+user.mobileNumber);
	        System.out.println("PASSWORD: "+user.password);
	        
	        i++;
	      }
	      
	}
}
