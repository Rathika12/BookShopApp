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
		Book.addBookDetails("THE ALCHAMIST", 50, 700);
		Book.addBookDetails("HARRY PARTOR", 100, 1500);
		Book.addBookDetails("BLACK BEAUTY", 70, 650);
		Book.addBookDetails("NEW MOON", 90, 800);
		//Book.displayBooks();   
		//Book.addBook(book);
		//Book.updateDetails("NEW MOON", "NEW SUN");
		Book.displayBooks();
	}

}
