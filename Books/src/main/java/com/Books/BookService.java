package com.Books;

import java.awt.print.Book;
import java.util.List;

public class BookService {
private BookDAO bookDAO;
    
    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }
    
    public void addBook(Book book) {
        bookDAO.saveBook(book);
    }
    
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }
}
