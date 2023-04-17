package com.Books;

import java.awt.print.Book;
import java.util.List;

public interface BookDAO {
	 List<Book> getAllBooks();
	    void saveBook(Book book);
}
