package com.bookshop;

import java.util.ArrayList;

public class UserDetailValidation {
    /**
     * Declaring variables needed as static.
     * To store the values from array list.
     */
    static String userName;
	static String userEmail;
	static String userPassword;
	
	 static long mobileNo;
	 /**
	  * Adding user details to the static variables.
	  * Call methods to validate the use details.
	  * @param user
	  */
	 public static void addUserDetails(ArrayList<User> user) {
		//For loop to add the user details one by one.
		 for(User detail : user) {
			userName = detail.name;
			userEmail = detail.email;
			userPassword = detail.password;
			
           mobileNo = detail.mobileNumber;
		}
		//Validating particular user details.
		boolean nameValid=isNameValid(userName);
		if(!nameValid) {
			System.out.println("Invalid user name");
		}
		
		boolean email = isValidEmail(userEmail);
		if(!email) {
			System.out.println("Invalid email");
		}
		
		boolean mobilenum = isValidMobileNum(mobileNo);
		if(!mobilenum) {
			System.out.println("Invalid mobile number");
		}
		
		boolean password = isValidPassword(userPassword,userName);
		if(!password) {
			System.out.println("Invalid password");
		}
      
   }
	 /**
	  * Validate user name.
	  * User name length greater than 3.
	  * User name not equal to null.
	  * @param name
	  * @return
	  */
   
	public static boolean isNameValid(String name) {
		
         if(name.length()<=2 || name.equals(0)) {
        	 return false;
         }
     return true;
   
     }
	/**
	 * Validating email id.
	 * The email id must start with character.
	 * The email id can have number in between.
	 * The email id must contain @ in between.
	 * After @ symbol email id must contain some character.
	 * After that email id must have . symbol.
	 * After . symbol it must have character with the length of 2-7.
	 * @param email
	 * @return
	 */
     public static boolean isValidEmail(String email) {
		
    	 String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                 "[a-zA-Z0-9_+&*-]+)*@" +
                 "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                 "A-Z]{2,7}$";
    	 if(email.matches(regex)) {
    		 return true;
    	 }
    	 return false;
    	 
     }
     /**
      * Validating mobile number.
      * The mobile number length should be 10.
      * The mobile number not a zero.
      * @param mobileNumber
      * @return
      */
     public static boolean isValidMobileNum(long mobileNumber) {
		 String number = String.valueOf(mobileNumber);
		 boolean validMobileNo = false;
		 if(number.length()==10) {
			 validMobileNo = true;
		 }
		 else {
			validMobileNo = false; 
		 }
		 return validMobileNo;
    		 

    	
    	 
     }
     /**
      * Validating password.
      * The password should have the length greater than or equal to 5.
      * The password can have both characters or numbers.
      * @param userPassword2
      * @return
      */
     public static boolean isValidPassword(String userPassword2,String userName) {
 		// TODO Auto-generated method stub
    	 
    	 if(userPassword2.length()<=4 || userName.contains(userPassword2)) {
    		 return false;
    	 }
 		return true;
 	}
  
}
