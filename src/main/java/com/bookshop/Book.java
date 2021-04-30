package com.bookshop;

import java.util.ArrayList;

public class Book {
	static ArrayList<BookDetails> books = new ArrayList<BookDetails>();
	/**
	 * Add Book details into array list.
	 * @param book
	 */
	
	public static void addBook(BookDetails book) {
		books.add(book);
	}

	/**
	 * This method is to add book details.
	 * @param name
	 * @param noBooks
	 * @param rate
	 */
	//BookDetails book = new BookDetails();
	public static void addBookDetails(String name,int noBooks,int rate) {
		System.out.println("---------ADD BOOKS--------");
		BookDetails book = new BookDetails();
		book.bookName = name;
		book.noOfBooks = noBooks;
		book.cost = rate;
		Book.addBook(book);
		System.out.println("BookName: "+ book.bookName + " NoOfBooks: "+ book.noOfBooks + " Cost: " + book.cost);
	}
	/**
	 * Display the Added Books.
	 */
	public static void displayBooks() {
		System.out.println("--------DISPLAY BOOK DETAILS----------");
		int i=0;
		for(BookDetails detail:books) {
			i++;
			System.out.println("BOOK NUMBER "+i);
			System.out.println(" BOOK NAME " + detail.bookName);
			System.out.println( "NO OF BOOKS " + detail.noOfBooks );
			System.out.println("BOOK COST " + detail.cost);
		}
	}
	
}
