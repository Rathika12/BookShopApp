package com.bookshop;

import java.util.ArrayList;

public class UserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1 = new User();
		user1.name = "Rathika";
		user1.email="rathika@gmail.com";
		user1.mobileNumber=9090909090L;
		user1.password="pass1";
		user1.DOB = "2000-06-12";
		//System.out.println("Name:  " + user1.name + "  Email: "+user1.email + "  Mobile Number:  " + user1.mobileNumber +"  Stage:  " +user1.stage + "  DOB:  " + user1.DOB);
		User user2 = new User();
		user2.name="nila";
		user2.email="nila@gmail.com";
		user2.mobileNumber = 8080808080L;
		user2.password="pass12";
		user2.DOB = "2010-07-11";
		//System.out.println("Name:  " + user2.name + "  Email: "+user2.email + "  Mobile Number:  " + user2.mobileNumber +"  Stage:  " +user2.stage + "  DOB:  " + user2.DOB);
		User user3 = new User();
		user3.name = "ezhil";
		user3.email = "ezhil@gmail.com";
		user3.password = "pass123";
		user3.mobileNumber = 7070707070L;
		user3.DOB = "1996-07-01";
		
		//System.out.println("Name:  " + user3.name + "  Email: "+user3.email + "  Mobile Number:  " + user3.mobileNumber +"  Stage:  " +user3.stage + "  DOB:  " + user3.DOB);
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		int i=1;
		
	      for (User user : userList) 
	      { 
	    	System.out.println("USER "+ i);  
	        System.out.println("NAME: "+user.name);
	        System.out.println("EMAIL: "+user.email);
	        System.out.println("MOBILE NUMBER: "+user.mobileNumber);
	        System.out.println("PASSWORD: "+user.password);
	        System.out.println("DOB: "+user.DOB);
	        i++;
	      }
	      
		
		}

}
