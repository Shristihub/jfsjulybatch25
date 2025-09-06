package com.threads.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +"... doing task" );
	}
}



public class ExecutorDemo {

	public static void main(String[] args) {
		// the place where the task is available
		Runnable task =  new Task();
		
		// before concurrency
//		for (int i = 1; i <= 100; i++) {
//			//thread created, started and then executes the task
//			Thread t1 = new Thread(task,"Thread-"+i);
//			t1.start();
//		}
		
		//after concurrency
		//create a pool of threads
		 ExecutorService executorService = Executors.newFixedThreadPool(10);
		 // execute the task
		 for (int i = 1; i <= 100; i++) {
			 //just execute the task
		 	 executorService.execute(task);
		 }
		 executorService.shutdown();
		 
	}
}
