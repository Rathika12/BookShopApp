package com.bookshop;

import java.util.HashMap;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Calculate Total amount for the books.
	 * @param bookName
	 * @param noOfBooks
	 * @return
	 */
	public static int billCalculation(String bookName,int cost) {
		
		HashMap<String,Integer> bookDetails = new HashMap<String,Integer>();
		bookDetails.put("THE ALCHAMIST", 500);
		bookDetails.put("HARRY PARTOR", 1500);
		bookDetails.put("BLACK BEAUTY", 700);
		bookDetails.put("NEW MOON", 800);
		int result=0;
		if(bookDetails.containsKey(bookName)) {
			int amount = bookDetails.get(bookName);
			result = amount*cost;
		}
		System.out.println(result);
		return result;
	}
	

}
