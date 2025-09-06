package com.bookapp.client;

import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Customer {

	public static void main(String[] args) {
		// interface ref =  implementation class
		IBookService bookService =  new BookServiceImpl();
		//call the methods
		
	}

}
