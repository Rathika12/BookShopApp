package com.bookshop;

import java.util.HashMap;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

    }
	/**
	 * Validate mobile number and password.
	 * @param userNumber
	 * @param password
	 * @return
	 */
	public static boolean isLoginValid(long userNumber,String password) {
		//Add the mobile number and password into the hashmap.
		HashMap<Long,String> login = new HashMap<Long,String>();
		login.put(9090909090L,"pass1");
		login.put(8080808080L,"pass12");
		login.put(7070707070L,"pass123");
		boolean loginValid = true;
		/**
		 * Find if mobile number and password is mapped or not.
		 */
		if(login.containsKey(userNumber)) {
			String passwordNew = login.get(userNumber);
			if(passwordNew.equals(password)) {
				loginValid = true;
				System.out.println("Valid mobilenumber and password");
			}
			else {
				loginValid = false;
				System.out.println("Invalid mobile number and password");
			}
		}
		else {
			loginValid = false;
			System.out.println("Invalid mobile number and password");
		}
		return loginValid;
		
	}
	}
