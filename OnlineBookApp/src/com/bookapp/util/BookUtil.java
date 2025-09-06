package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookUtil {

	
	  public static List<Book> showBooks(){
		   return Arrays.asList(
				  new Book("Java in Action",1, "David", 2000,"Tech"),
				  new Book("Java in Action",1, "David", 2000,"Tech"),
				  new Book("Java in Action",1, "David", 2000,"Tech"),
				  new Book("Java in Action",1, "David", 2000,"Tech"),
				  new Book("Java in Action",1, "David", 2000,"Tech")   
				   );
	   }
}
