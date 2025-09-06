package com.threads.concurrentsync;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallDemo {
	public static void main(String[] args) {
		Bank bank =  new Bank();
		ExecutorService  executor = Executors.newFixedThreadPool(10);
		Callable<String> task1 = ()->{
			return "welcome";
		};
		Future<String> result =  executor.submit(task1);
		try {
			String message = result.get();
			System.out.println(message);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		//2nd task
		Future<Double> futresult = executor.submit(()->{
			double interest = bank.calcInterest("Raju",10000);
			return interest;
		});
		try {
			System.out.println(futresult.isCancelled());
			System.out.println(futresult.isDone());
//			System.out.println(futresult.cancel(true));
			if(!futresult.isDone()) {
			  double intamount = futresult.get();
			  System.out.println(futresult.isDone());
			  System.out.println("res " +intamount);
		}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		executor.shutdown();
		
		
		
	}

}
