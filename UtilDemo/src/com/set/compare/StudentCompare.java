package com.set.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentCompare {

	public static void main(String[] args) {
		List<Student> students = 
				Arrays.asList(
					new Student("Raju","Ooty",32),
					new Student("Jeni","Bengaluru",4),
					new Student("Kevin","Chennai",12),
					new Student("Akash","Ooty",8),
					new Student("Tina","Mysore",1),
					new Student("Sri","Mysore",6));
		
		Comparator<Student> com = new NameSort(); // class that implements comparator
		Collections.sort(students, com);
		System.out.println("Sorting by name");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();
		System.out.println("Sorting by city");
		Collections.sort(students, new CitySort());
		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println();
		System.out.println("Sorting by Id");
		Collections.sort(students, new IdSort());
		for (Student student : students) {
			System.out.println(student);
		}
		
		
		
	}
}
