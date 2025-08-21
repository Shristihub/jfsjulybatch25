package com.threads.ex;

public class Messenger {
	
	void printMessage(String name) {
		System.out.println("Welcome "+name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Goodbye "+name);
	}

}
