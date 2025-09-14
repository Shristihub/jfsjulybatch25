package com.bookapp.service;

import java.util.List;

import com.bookapp.model.Book;

// this is written by another person
public interface IBookService {
    
	//valid,exception,empty,null
	List<Book> getByAuthor(String author);
	//valid book object,exception,null
	Book getById(int bookId);
	//no return value or exception
	void addBook(Book book);
}
