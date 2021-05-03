package com.bookshoptestcase;

import static org.junit.Assert.*;


import org.junit.Test;

import com.bookshop.*;

public class BookTestCase {

	@Test
	/**
	 * Adding book details.
	 */
	public void addBook() {
		Book.addBookDetails("TAMIL","MAHABHARATHAM", 10, 2000);
		Book.addBookDetails("TAMIL","PONNIN SELVAN",12, 1200);
		Book.addBookDetails("ENGLISH","THE ALCHAMIST", 50, 700);
		Book.addBookDetails("ENGLISH" ,"HARRY PARTOR", 100, 1500);
		Book.addBookDetails("ENGLISH" ,"BLACK BEAUTY", 70, 650);
		Book.addBookDetails("ENGLISH" ,"NEW MOON", 90, 800);
		//Book.displayBooks();   
		//Book.addBook(book);
		//Book.updateDetails("NEW MOON", "NEW SUN");
		Book.displayBooks();
		
	}
	@Test
	public void searchBook1() {
		String language = "TAMIL";
		boolean catogory = Book.searchCatogory(language);
		
		assertEquals(true,catogory);
	}
	@Test
	public void searchBook2() {
		String language = "ENGLISH";
		boolean catogory = Book.searchCatogory(language);
		
		assertEquals(true,catogory);
	}


}
