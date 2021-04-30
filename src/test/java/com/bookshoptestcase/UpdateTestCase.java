package com.bookshoptestcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bookshop.Update;

public class UpdateTestCase {

	@Test
	/**
	 * Update No of books by giving valid Book name
	 * and valid no of books greater than or equal to 1.
	 */
	public void updateTestCase1() {
		int res = Update.updateNoOfBooks("HARRY PARTOR", 1);
		assertEquals(149,res);
	}
	@Test
	/**
	 * Validate no of books by giving incorrect books name.
	 * here HARRY is an incorrect book name.
	 */
	public void updateTestCase2() {
		int res = Update.updateNoOfBooks("HARRY", 1);
		assertEquals(0,res);
		System.out.println("Book not Available");
	}
	@Test
	/**
	 * Validate updated no of books by giving invalid number of books to buy.
	 * The no of books to buy is 0.
	 */
	public void updateTestCase3() {
		int res = Update.updateNoOfBooks("HARRY PARTOR", 0);
		assertEquals(150,res);
		System.out.println("Number of Books selected is zero");
	}
	@Test
	/**
	 * Validate updated no of books by giving invalid number of books to buy.
	 * The no of books to buy is -1.
	 */
	public void updateTestCase4() {
		int res = Update.updateNoOfBooks("HARRY PARTOR", -1);
		assertEquals(151,res);
		System.out.println("Incorect number of books");
	}

}
