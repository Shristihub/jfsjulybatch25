package com.streams.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InStreams1 {

	public static void main(String[] args) {
		
		Function<String,Integer> fun =(str)->str.length();
		List<String> courses = 
				Arrays.asList("Java","JSP","CSS","HTML","Spring","Java","Micro","Javascript");
		//convert to a stream
		courses.stream()
				.filter(str->str.length()>3)
				.sorted()
				.forEach(str->System.out.println(str.toUpperCase()));
//		        .forEach(System.out::println);
		
		System.out.println();
		List<String> ncourses = courses.stream()
		  .filter(str->str.length()>3)
		  .sorted((s1,s2)->s2.compareTo(s1))
//		  .limit(3)
		  .skip(3)
		  .distinct()
//		  .toList();
		  .collect(Collectors.toList());
		 ncourses.forEach(System.out::println);
		 
		 System.out.println();
		 courses.stream()
		 .filter(str->str.startsWith("K"))
//	     .map(str->str.toUpperCase())	
		 .map(String::toUpperCase)
	     .forEach(System.out::println);
		
		
		 Iterator<Integer> it = courses.stream()
		 .filter(str->str.startsWith("J"))
	     .map(String::length)		 
	     .iterator();
		 //iterate and print
		 while (it.hasNext()) {
			Integer in = it.next();
			System.out.println(in);
		}
		 
		 
		
	}
}





