package com.bookshop;

import java.util.ArrayList;

public class Book {
	public static ArrayList<BookShopDetails> books = new ArrayList<BookShopDetails>();
	/**
	 * Add Book details into array list.
	 * @param book
	 */
	
	public static void addBook(BookShopDetails book) {
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
		BookShopDetails book = new BookShopDetails();
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
		for(BookShopDetails detail:books) {
			i++;
			System.out.println("BOOK NUMBER "+i);
			System.out.println("LANGUAGE "+detail.language);
			System.out.println(" BOOK NAME " + detail.bookName);
			System.out.println( "NO OF BOOKS " + detail.noOfBooks );
			System.out.println("BOOK COST " + detail.cost);
		}
	}
	/**
	 * This method helps to categorize the book using language.
	 * @param language
	 * @return boolean
	 */
	public static boolean searchCatogoryLanguage(String language) {
		boolean bookPresent = false;
		int i=0;
		for(BookShopDetails detail:books) {
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
	/**
	 *This method is used to search book by giving name. 
	 * @param bookName
	 * @return boolean
	 */
	public static boolean searchByBookName(String bookName) {
		boolean valid = false;
		for(BookShopDetails detail:books) {
			   if(detail.bookName.equals(bookName)) {
				   valid = true;
				   System.out.println("Your result for searching  "+bookName);
				   System.out.println("Book language "+detail.language);
					System.out.println( "NO OF BOOKS " + detail.noOfBooks );
					System.out.println("BOOK COST " + detail.cost);
				   
			   }
				
		}
		return valid;
	}
	
}
