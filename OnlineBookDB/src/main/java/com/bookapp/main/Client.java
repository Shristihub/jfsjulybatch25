package com.bookapp.main;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args) {
		IBookService bookService = new BookServiceImpl();
		bookService.addBook(new Book("Java", "Kathy", 800, "Tech"));
	}
}
