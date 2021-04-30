package com.bookshoptestcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bookshop.Bill;

public class BillTestCase {

	/**
	 *Test case for valid input with correct book name and number of books. 
	 */
	@Test
	
	public void billTestCase1() {
		int res=Bill.billCalculation("NEW MOON", 2);
		System.out.println("Your Bill is "+res);
		assertEquals(1600,res);
	}
	/**
	 * Test case for incorrect book name.
	 * Incorrect book name is NEW.
	 */
	@Test
	public void billTestCase2(){
		int res=Bill.billCalculation("NEW", 2);
		System.out.println("Invalid Book Name");
		assertEquals(0,res);
	}
	@Test
	/**
	 * Test case for No of books selected as zero.
	 * Invalid number of book while selecting 0 books.
	 */
	public void billTestCase3(){
		int res=Bill.billCalculation("NEW MOON", 0);
		System.out.println("Invalid Number books");
		assertEquals(0,res);
	}
	@Test
	/**
	 * Test case for No of books selected as negative.
	 * Invalid number of book while selecting -1 books.
	 */
	public void billTestCase4(){
		int res=Bill.billCalculation("NEW MOON", -1);
		System.out.println("Invalid number of books");
		assertEquals(-800,res);
	}
	@Test
	/**
	 *Test case for invalid book name and number of books.
	 *Invalid book name is NEW.
	 *Invalid number of books to buy is -1.
	 */
	public void billTestCase5(){
		int res=Bill.billCalculation("NEW", -1);
		System.out.println("Invalid book name and number of books");
		assertEquals(0,res);
	}

}
