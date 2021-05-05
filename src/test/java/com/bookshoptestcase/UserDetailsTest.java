package com.bookshoptestcase;

import static org.junit.Assert.*;


import org.junit.Test;
import com.bookshop.*;
public class UserDetailsTest {

	@Test
	/**
	 * To add user details.
	 */
	public void addUser() {
		UserManager.addNewUser();
	}
	@Test
	/**
	 * To display user details.
	 */
	public void display() {
		UserManager.displayUserDetails(UserManager.userList);
	}
	@Test
	/**
	 * Test the user name.
	 * The name should have the length atleast 3.
	 */
	public void userNameTestCase1() {
		String name = "Rathika";
		boolean valid = UserDetailValidation.isNameValid(name);
	    assertTrue(valid);
	}
	@Test
	/**
	 *Test the user name.
	 *Testing with invalid user name.
	 *Here the user name length<3. 
	 */
	public void userNameTestCase2() {
		String name = "R";
		boolean valid = UserDetailValidation.isNameValid(name);
	    assertFalse(valid);
	}
	@Test
	/**
	 * Test the user name.
	 * If user name is null the method cannot accept.
	 */
	public void userNameTestCase3() {
		String name = "";
		boolean valid = UserDetailValidation.isNameValid(name);
	    assertFalse(valid);
	}
	@Test
	/**
	 * The email id must start with character.
	 * The email id can have number in between.
	 * The email id must contain @ in between.
	 * After @ symbol email id must contain some character.
	 * After that email id must have . symbol.
	 * After . symbol it must have character with the length of 2-7.
	 * Here,Tested with vaild email id.
	 */
	public void userEmailTestCase1() {
		String email = "rathikaalagar12@gmail.com";
		boolean valid = UserDetailValidation.isValidEmail(email);
		assertTrue(valid);
	}
	@Test
	/**
	 * Here Tested with invalid email id.
	 * Here,the mail id without @ symbol.
	 */
	public void userEmailTestCase2() {
		String email = "rathikaalagar12gmail.com";
		boolean valid = UserDetailValidation.isValidEmail(email);
		assertFalse(valid);
	}
	@Test
	/**
	 * Here Tested with invalid email id.
	 * Here,the mail id without . symbol.
	 */
	public void userEmailTestCase3() {
		String email = "rathikaalagar12@gmailrathikaalagar";
		boolean valid = UserDetailValidation.isValidEmail(email);
		assertFalse(valid);
	}
	@Test
	/**
	 * The mobile number should have 10 digit.
	 * Here,Tested with valid mobile number.
	 * The mobile number has 10 digits.
	 */
	public void userMobileNoTestCase1() {
		Long mobileNo = 9090989898L;
		boolean valid = UserDetailValidation.isValidMobileNum(mobileNo);
		assertTrue(valid);
	}
	@Test
	/**
	 * Here,Tested with invalid mobile number.
	 * The mobile number has 10 digits.
	 * It has the length of 10 but the value is null.
	 * so,method did not accept the mobile number.
	 */
	public void userMobileNoTestCase2() {
		Long mobileNo = 0000000000L;
		boolean valid = UserDetailValidation.isValidMobileNum(mobileNo);
		assertFalse(valid);
	}
	@Test
	/**
	 * The mobile number should have 10 digit.
	 * Here,Tested with invalid mobile number.
	 * The mobile number has 10 digits.
	 * But it hase only 5 digit.
	 */
	public void userMobileNoTestCase3() {
		Long mobileNo = 90908L;
		boolean valid = UserDetailValidation.isValidMobileNum(mobileNo);
		assertFalse(valid);
	}
	@Test
	/**
	 * Password should have 5 characters or numbers.
	 * Password should have the length 5 or more.
	 * Here,Tested with valid password.
	 * The length greater than 4 so accepted.
	 */
	public void userPasswordTestCase1() {
		String password = "rath2633";
		boolean valid = UserDetailValidation.isValidPassword(password);
		assertTrue(valid);
	}
	@Test
	/**
	 * Here the password has only numbers.
	 * The length greater than 4 so accepted.
	 */
	
	public void userPasswordTestCase2() {
		String password = "26333";
		boolean valid = UserDetailValidation.isValidPassword(password);
		assertTrue(valid);
	}
	@Test
	/**
	 * Here the password has only characters. 
	 * The length less than 5 so not accepted.
	 */
	public void userPasswordTestCase3() {
		String password = "rath";
		boolean valid = UserDetailValidation.isValidPassword(password);
		assertFalse(valid);
	}
	@Test
	/**
	 * Here the password has only numbers. 
	 * The length less than 5 so not accepted.
	 */
	public void userPasswordTestCase4() {
		String password = "90";
		boolean valid = UserDetailValidation.isValidPassword(password);
		assertFalse(valid);
	}
	@Test
	/**
	 * Here the password has only characters. 
	 * The length greater than 4 so accepted.
	 */
	public void userPasswordTestCase5() {
		String password = "rathika";
		boolean valid = UserDetailValidation.isValidPassword(password);
		assertTrue(valid);
	}

	
	
}
