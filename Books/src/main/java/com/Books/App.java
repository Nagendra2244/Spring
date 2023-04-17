package com.Books;


import java.awt.print.Book;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{

	
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      BookService obj=(BookService) context.getBean(BookDAO.class);
       Books book = new Books();
           book.getAuthor();
       //obj.addBook(Book book);  
      List<Book> a1=obj.getAllBooks();
      System.out.println(a1);
   }
}