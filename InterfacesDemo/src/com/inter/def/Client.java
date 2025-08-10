package com.inter.def;

public class Client {

	public static void main(String[] args) {
		IProject project =  new TeamOne();
		project.doTask();
		String[] techstack = project.techStackUsed();
		for (String tech : techstack) {
			System.out.println(tech);
		}
		project =  new TeamTwo();
		project.doTask();
		
		techstack = project.techStackUsed();
		for (String tech : techstack) {
			System.out.println(tech);
		}
		//call static method
		IProject.coursesTaken();
		
		
	}
}
