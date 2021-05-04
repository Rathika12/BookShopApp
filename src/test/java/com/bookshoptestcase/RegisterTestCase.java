package com.bookshoptestcase;

import static org.junit.Assert.*;


import org.junit.Test;

import com.bookshop.Register;

public class RegisterTestCase {

	@Test
	/**
	 * validate mobile number and password with by giving correct Mobile number
	 * and matching password.
	 */
	
	public void loginTestCase1() {
	   long mobileNum = 9090909090L;
	   String password = "pass1";
	   boolean valid= Register.isLoginValid(mobileNum,password);
	   assertEquals(true,valid);
	}
	@Test
	/**
	 * Validate by giving incorrect mobile number and correct password.
	 */
	public void loginTestCase2() {
		   long mobileNum = 80808080L;
		   String password = "pass12";
		   boolean valid= Register.isLoginValid(mobileNum,password);
		   assertEquals(false,valid);
		}
	@Test
	/**
	 * Validate by giving valid mobile number and invalid password.
	 */
	public void loginTestCase3() {
		   long mobileNum = 7070707070L;
		   String password = "pass13";
		   boolean valid= Register.isLoginValid(mobileNum,password);
		   assertEquals(false,valid);
		}
	@Test
	/**
	 * Validate by giving incorrect mobile number and password.
	 */
	public void loginTestCase4() {
		   long mobileNum = 000L;
		   String password = "000";
		   boolean valid= Register.isLoginValid(mobileNum,password);
		   assertEquals(false,valid);
		}

}
