package com.set.demos;

import java.util.Objects;

public class Book implements Comparable<Book>{

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
	public int hashCode() {
		return Objects.hash(bookId, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return bookId == other.bookId && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookId=" + bookId + "]";
	}
	@Override
	public int compareTo(Book o) {
		return getTitle().compareTo(o.getTitle());
	}
	
}
