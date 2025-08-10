package com.oops.st;

public class Trial {
	static int x =10;
	static int y;

	static {
		y=20;
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	static void greet(){
		System.out.println("Great day");
	}
	
}
