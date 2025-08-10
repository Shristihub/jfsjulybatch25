package com.oops.abs;

public class WebCourses extends CourseDetails {

	@Override
	String[] showCourses() {
		return new String[] {"Html", "css","javascript"};
	}
	// own method
	void showProjects(){
		System.out.println("static pages");
		System.out.println("contact forms");
	}
//	@Override
//	void certificationsAllowed() {
//		System.out.println("in webcourses");
//	}

	
}
