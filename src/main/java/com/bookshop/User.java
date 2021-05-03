package com.bookshop;

public class User {
		public String name;
		public String email;
		public long mobileNumber;
		public String password;//Instance variable
		static String stage = "Student";//static variable
		public String DOB;
		@Override
		public String toString() {
			String str =  "User [name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber + ", password="
					+ password + ", DOB=" + DOB + "]";
			return str;
		}
	   
		
	
}
