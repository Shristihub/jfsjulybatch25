package com.bookapp.service;

import java.util.List;

import com.bookapp.model.Book;

// the class to be tested
public class OrderDetails {

	private IBookService bookService;

	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}
	
	public List<String> getTitlesByAuthor(String author){
		//call the method ofbookService
		List<Book> books = bookService.getByAuthor(author);
		return null;
	}
	
	public double orderBook(int bookId, int quantity){
		Book book = bookService.getById(bookId);
		return 0;
	}
	public String insertBook(Book book){
		bookService.addBook(book);
		return null;
	}
	
	
	
	
}
