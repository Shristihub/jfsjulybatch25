package com.inter.def;

import java.util.Iterator;

public interface IProject {

	 void doTask();
	 // to add new functionality to an existing interface 
	// can be overridden
	 default String[] techStackUsed() {
		return new String[] {"jenkins","git"};
	 }
	 // common method for all implementation classes
	 // cannot be overridden
	 // can be called only using interface name
	 static void coursesTaken() {
		 System.out.println("Framewor training");
	 }
	 
}
