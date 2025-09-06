package com.set.demos;

import java.util.HashSet;
import java.util.TreeSet;

public class BookMain {
	public static void main(String[] args) {
		Book book1= new Book("Java",1,"Kathy");
		Book book2= new Book("Java",1,"Kathy");
		Book book3= new Book("JSP",2,"Kathy");
//		HashSet<Book> set =  new HashSet<>();
		TreeSet<Book> set =  new TreeSet<>();
		set.add(book1);
		set.add(book2);
		set.add(book3);
		System.out.println(set);
	}

}
