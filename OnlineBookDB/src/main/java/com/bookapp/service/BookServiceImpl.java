package com.bookapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.DBConnection;
import com.bookapp.util.Queries;

public class BookServiceImpl implements IBookService {
	static Connection connection;
	static {
		connection = DBConnection.openConnection();
	}

	@Override
	public void addBook(Book book) {
		
		//create a PreparedStatement by using connection
		try(PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);){
		//set values for plaaceholders
		statement.setString(1,book.getTitle());
		statement.setString(2,book.getAuthor());
		//call execute 
		statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByCategoryLessPrice(String category, double price) throws BookNotFoundException {
	    
		return null;
	}

	@Override
	public List<Book> getByTitleContains(String title) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
