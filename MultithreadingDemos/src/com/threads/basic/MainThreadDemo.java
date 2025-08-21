package com.threads.basic;

public class MainThreadDemo {

	public static void main(String[] args) {
		Thread t =  Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.setName("Poppy");
		t.setPriority(10);
		System.out.println(t);
		int x =10/0;
	}
}
