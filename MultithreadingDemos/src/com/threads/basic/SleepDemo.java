package com.threads.basic;

public class SleepDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		for (int i = 0; i <= 5; i++) {
			System.out.println("Welcome " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
