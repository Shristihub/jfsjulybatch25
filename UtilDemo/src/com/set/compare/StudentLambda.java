package com.set.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentLambda {

	public static void main(String[] args) {
		List<Student> students = 
				Arrays.asList(
					new Student("Raju","Ooty",32),
					new Student("Jeni","Bengaluru",4),
					new Student("Kevin","Chennai",12),
					new Student("Akash","Ooty",8),
					new Student("Tina","Mysore",1),
					new Student("Sri","Mysore",6));
		
		// using lambda expression
		Comparator<Student> com = (o1, o2)->{
			return o1.getStudentName().compareTo(o2.getStudentName());
		};
		Collections.sort(students,com);
		System.out.println("Sorting by name");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();
		Collections.sort(students,(o1,o2)-> o1.getCity().compareTo(o2.getCity()));
		System.out.println("Sorting by city");
		for (Student student : students) {
			System.out.println(student);
		}
		
		Collections.sort(students, Comparator.comparing(Student::getStudentId));
		
		
		
		
		
		
		
	}
}
