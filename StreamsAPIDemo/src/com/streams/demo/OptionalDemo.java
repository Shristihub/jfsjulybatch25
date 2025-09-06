package com.streams.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java", "JSP", "CSS", "HTML", "Spring", "Java", "Micro");

		// get the first element
		Optional<String> opt = courses.stream().filter(str -> str.startsWith("K")).findFirst();

		// always check optional before printing it
//		if (opt.isPresent()) {
		if(!opt.isEmpty()) {
			String str = opt.get();
			System.out.println(str);
		}
		System.out.println();
		opt.ifPresent(System.out::println);
		opt.ifPresentOrElse(System.out::println, ()->System.out.println("substitute value"));
		
		System.out.println("Using Or method");
		opt = courses.stream()
				.filter(str -> str.startsWith("K"))
				.findFirst()
				.or(()-> Optional.of("no value"));
		opt.ifPresent(System.out::println);
		
		System.out.println();
		System.out.println("Using OrElse method");
		String str = courses.stream()
					.filter(str1 -> str1.startsWith("S"))
					.findFirst()
					.orElse(checkName());
		System.out.println(str);
		
		System.out.println();
		System.out.println("Using OrElseGet method");
		 str = courses.stream()
					.filter(str1 -> str1.startsWith("S"))
					.findFirst()
					.orElseGet(()->checkName());
		 System.out.println(str);
		 
		 courses.stream()
			.filter(str1 -> str1.startsWith("AS"))
			.findFirst()
			.orElseThrow(()->new RuntimeException("invalid"));
	}
		
	static String checkName() {
		System.out.println("checking");
		return "new value";
	}
}
