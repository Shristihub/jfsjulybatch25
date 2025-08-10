package com.oops.abs;

public class Client {

	public static void main(String[] args) {
		CourseDetails courseDetails = new WebCourses();
//		String[] courses=courseDetails.showCourses();
//		for (String course : courses) {
//			System.out.println(course);
//		}
//		courseDetails.certificationsAllowed();
//		//downcast
//		WebCourses web = (WebCourses)courseDetails;
//		web.showProjects();
		System.out.println();
		//fullstack
		courseDetails = new JavaStack();
		courseDetails.certificationsAllowed(); // concrete
		String[] jscourses = courseDetails.showCourses();
		
		System.out.println(".... for jfs object....");
		JavaStack javaStack = (JavaStack)courseDetails;
		javaStack.printDetails(); // own method
		javaStack.courseTypes(); //super class method
		javaStack.certificationsAllowed(); //super super class method
		
		System.out.println(".... for fullstack ref object....");
		FullstackCourses ref =  javaStack;
		ref.courseTypes(); //own method
		ref.certificationsAllowed(); //super class method
	
	
	
	
	
	
	
	
	
	}

}
