package com.bookapp.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookUtil;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAllBooks() {
		// call showBooks method from BookUtil to get all
		List<Book> books =  BookUtil.showBooks();
		Collections.sort(books, Comparator.comparing(Book::getTitle));
		return books;
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByCategoryLessPrice(String category, double price) throws BookNotFoundException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByTitleContains(String title)throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
