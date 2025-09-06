package com.fun.demos;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class FunDemo {

	public static void main(String[] args) {
		// implementation
		Consumer<String> con = str ->System.out.println("Hello "+str.toUpperCase());
		//calling part
		con.accept("Sri");
		Consumer<Integer> con1 = num->System.out.println(num*10);
		con1.accept(10);
		Consumer<Book> con2 = book -> System.out.println(book.getTitle());
		con2.accept(new Book("Java", 10, "Kathy"));
		
		Supplier<Integer> sup  = ()-> 10;
		System.out.println(sup.get());
		
		Supplier<Book> sup1 = ()->new Book("Html",12,"Roy");
		System.out.println(sup1.get());
		
		Predicate<String> pred = str->str.equals("Priya"); 
		System.out.println(pred.test("priya"));
		
		Predicate<Book> pred1 = book-> book.getTitle().equals("Java");
		System.out.println(pred1.test(new Book("Java", 10, "Kathy")));
		
		Function<String,Integer> fun  = str->str.length();
		System.out.println(fun.apply("Priya"));
		
		Function<Book,String> fun1 = book->book.getTitle().toUpperCase();
		System.out.println(fun1.apply(new Book("Java", 10, "Kathy")));
		
		
		
	}
}
