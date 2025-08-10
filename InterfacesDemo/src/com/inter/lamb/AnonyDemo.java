package com.inter.lamb;

public class AnonyDemo {

	public static void main(String[] args) {
		System.out.println("Hello");
		// this is implementation
		IGreeter greeter = new IGreeter() {
			@Override
			public void greetMessage(String name) {
				System.out.println("Welcome "+name);
				
			}
			@Override
			public void check() {
				System.out.println("hi");
			}
		};
		System.out.println("Great day");
		// call the method
		greeter.greetMessage("Sri");
	}
}
