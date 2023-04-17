package com.Books;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class MockBookDAO implements BookDAO{

	 List<Book> books = new ArrayList<>();
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		 books.add(book);
	}


	

}
