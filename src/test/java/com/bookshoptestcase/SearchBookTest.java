package com.bookshoptestcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bookshop.Book;

public class SearchBookTest {

	@Test
	public void searchBook() {
		String language = "TAMIL";
		boolean catogory = Book.searchCatogory(language);
		assertEquals(true,catogory);
	}

}
