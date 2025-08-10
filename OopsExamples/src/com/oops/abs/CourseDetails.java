package com.oops.abs;

public abstract class CourseDetails {
	
	final String academy = "Shristi";

	abstract String[] showCourses();
	//concrete methods
	void certificationsAllowed() {
		System.out.println("Java");
		System.out.println("Cloud");
		instituteDetails();
	}
	private void instituteDetails() {
		System.out.println("Bangalore");
	}
}
