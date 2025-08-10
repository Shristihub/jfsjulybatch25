package com.inter.lamb;

public class LambDemo {

	public static void main(String[] args) {
		IPrinter printer = ()->{
			System.out.println("Great day");
		};
		printer.showMsg();
		//single line
		printer = ()->System.out.println("Goodbye");
		printer.showMsg();
		
		//implementation
		ICourse course = name->System.out.println("Name "+name);
		//call the method
		course.showCourseName("FullStack");
		
		// method returning an array
		ISports sports = ()-> new String[] {"football","cricket"};
		//call the method
		String[] types = sports.sportsType();
		for (String type : types) {
			System.out.println(type);
		}
		
		IChecker check = name->name.length();
		System.out.println(check.showLength("Sripriya"));
		
	}
}
