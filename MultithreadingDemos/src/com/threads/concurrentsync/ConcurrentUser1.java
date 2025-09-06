package com.threads.concurrentsync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentUser1 {

	public static void main(String[] args) {
		Bank bank =  new Bank();
		ExecutorService  executor = Executors.newFixedThreadPool(10);
		double amount=10000;
		//task1
		Runnable task1 = ()->{
			
			bank.calcInterest("Raju", amount);
		};
		//task2
		Runnable task2 = ()->{
			bank.payBills(amount);
		};
		executor.execute(task2);
		executor.execute(task1);
		executor.execute(()->System.out.println("hello task3"));
		executor.shutdown();
		
		
	}
}
