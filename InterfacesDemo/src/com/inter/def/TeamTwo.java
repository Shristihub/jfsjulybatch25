package com.inter.def;

public class TeamTwo implements IProject{

	@Override
	public void doTask() {
		System.out.println("Project done using JFS stack");
	}
	//default methods can be overridden
	@Override
	public String[] techStackUsed() {
		String[] techstack = IProject.super.techStackUsed();
		for (String tech : techstack) {
			System.out.println(tech);
		}
		return new String[] {"Spring","Java","Junit"};
	}

	
    
	
}
