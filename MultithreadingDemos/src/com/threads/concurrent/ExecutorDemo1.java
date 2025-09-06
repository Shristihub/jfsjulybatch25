package com.threads.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo1 {

	public static void main(String[] args) {
		
		// create a thread pool
		ExecutorService executor =  Executors.newFixedThreadPool(10);
		Runnable runner = ()->{
			System.out.println("inside run method");
		};
		
		executor.execute(()->{
			System.out.println("implementing run method");
		});
		executor.shutdown();
		
	}
}
