package com.bookshoptestcase;

import static org.junit.Assert.*;


import org.junit.Test;

import com.bookshop.*;

public class BookTestCase {

	@Test
	/**
	 * Adding book details.
	 * Display the book details after adding books.
	 */
	public void addDisplayBook() {
		Book.addBookDetails("TAMIL","MAHABHARATHAM", 10, 2000);
		Book.addBookDetails("TAMIL","PONNIN SELVAN",12, 1200);
		Book.addBookDetails("ENGLISH","THE ALCHAMIST", 50, 700);
		Book.addBookDetails("ENGLISH" ,"HARRY PARTOR", 100, 1500);
		Book.addBookDetails("ENGLISH" ,"BLACK BEAUTY", 70, 650);
		Book.addBookDetails("ENGLISH" ,"NEW MOON", 90, 800);
		System.out.println("Books are added");
		//Book.displayBooks();   
		//Book.addBook(book);
		//Book.updateDetails("NEW MOON", "NEW SUN");
		//System.out.println("Display Books");
		//Book.displayBooks();
		
	}
	@Test
	/**
	 *Search book by language.
	 *This method test the book that present in the book shop.
	 *Test with Tamil language book.
    */

	public void searchBook1() {
		String language = "TAMIL";
		System.out.println("List of "+language+" books");
		boolean catogory = Book.searchCatogoryLanguage(language);
		
		assertEquals(true,catogory);
	}
	@Test
	/**
	 *Search book by language.
	 *This method test the book that present in the book shop.
	 *Test with English language book.
    */
	public void searchBook2() {
		String language = "ENGLISH";
		System.out.println("List of "+language+" books");
		boolean catogory = Book.searchCatogoryLanguage(language);
		
		assertEquals(true,catogory);
	}
	@Test
	/**
	 * Search book by language.
	 * This method test the book not present in the book shop.
	 * Test with Hindhi language book.
	 */
	public void searchBook3() {
		String language = "HINDHI";
		System.out.println("List of "+language+" books");
		boolean catogory = Book.searchCatogoryLanguage(language);
		
		assertEquals(false,catogory);
	}
	@Test
	/**
	 * Search Book by Book name.
	 * This method test the with book name present in the book shop.
	 * Tested with book name as NEW MOON.
	 */
	public void searchBookByName1() {
		String bookName = "NEW MOON";
		System.out.println("Details for the book "+bookName);
		boolean result = Book.searchByBookName(bookName);
		
		assertEquals(true,result);

	}
	@Test
	/**
	 * Search Book by Book name.
	 * This method test the with book name not present in the book shop.
	 * Tested with book name as MOON.
	 */
	public void searchBookByName2() {
		String bookName = "MOON";
		System.out.println("Details for the book "+bookName);
		boolean result = Book.searchByBookName(bookName);
		
		assertEquals(false,result);

	}



}
