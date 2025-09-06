package com.fun.demos;

public class Book {

	private String title;
	private String author;
	private int bookId;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, int bookId, String author) {
		super();
		this.title = title;
		this.author = author;
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookId=" + bookId + "]";
	}
	
	
	
}
