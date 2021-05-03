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
	public static void addBookDetails(String language,String name,int noBooks,int rate) {
		//System.out.println("---------ADD BOOKS--------");
		BookDetails book = new BookDetails();
		book.language = language;
		book.bookName = name;
		book.noOfBooks = noBooks;
		book.cost = rate;
		Book.addBook(book);
		
	}
	/**
	 * Display the Added Books.
	 */
	public static void displayBooks() {
		//System.out.println("--------DISPLAY BOOK DETAILS----------");
		int i=0;
		for(BookDetails detail:books) {
			i++;
			System.out.println("BOOK NUMBER "+i);
			System.out.println("LANGUAGE "+detail.language);
			System.out.println(" BOOK NAME " + detail.bookName);
			System.out.println( "NO OF BOOKS " + detail.noOfBooks );
			System.out.println("BOOK COST " + detail.cost);
		}
	}
	public static boolean searchCatogory(String language) {
		boolean bookPresent = false;
		int i=0;
		for(BookDetails detail:books) {
		   if(detail.language.equals(language)) {
			   bookPresent = true;
			   i++;
			   System.out.println("Books in language "+language+ " is " +i);
				System.out.println(" BOOK NAME " + detail.bookName);
				System.out.println( "NO OF BOOKS " + detail.noOfBooks );
				System.out.println("BOOK COST " + detail.cost);
			   
		   }
			
	}
		System.out.println("Total Number of books in language "+language+ " is " +i);
		return  bookPresent;
	}
	
}
