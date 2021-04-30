package com.bookshop;

import java.util.HashMap;

public class Update {
    /**
     * Update the number of books after the buyer choose number of books to buy.
     * @param bookName
     * @param noOfBooks
     * @return
     */
	public static int updateNoOfBooks(String bookName,int noOfBooks) {
		HashMap<String,Integer> bookDetails = new HashMap<String,Integer>();
		bookDetails.put("THE ALCHAMIST", 50);
		bookDetails.put("HARRY PARTOR", 150);
		bookDetails.put("BLACK BEAUTY", 70);
		bookDetails.put("NEW MOON", 50);
		int noBooksModified = 0;
		if(bookDetails.containsKey(bookName)) {
			int total = bookDetails.get(bookName);
			noBooksModified = total-noOfBooks;
		}
		System.out.println(noBooksModified);
		return noBooksModified;
		
	}
}
