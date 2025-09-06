package com.threads.concurrentsync;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class ConRunner implements Runnable{
	private String name;
	private double amount;
	Bank bank;

	public ConRunner(String name, double amount, Bank bank) {
		super();
		this.name = name;
		this.amount = amount;
		this.bank = bank;
	}
	@Override
	public void run() {
		  synchronized(bank) {
			 System.out.println("Interest Calculation for "+name);
			 double interest = bank.calcInterest(name, amount);
			 System.out.println("Interest "+interest+" Goodbye");
			 System.out.println();
		}}
	
}

public class ConcurrentUser {

	public static void main(String[] args) {
			
		//shared resource 
		Bank bank =  new Bank();
		ExecutorService  executor = Executors.newFixedThreadPool(10);
//		ConRunner  runner = new ConRunner("Raju",1000,bank);
//		executor.execute(runner);
	    Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			executor.execute(new ConRunner(sc.next(),sc.nextInt(),bank));
			
		}
		
		
//		String name = "Raju";
//		executor.execute(()->{
//			System.out.println("Interest Calculation for "+"Ram");
//			 double interest = bank.calcInterest(name, 2000);
//			 System.out.println("Interest "+interest+" Goodbye");
//			 System.out.println();
//		});
		
		executor.shutdown();
		
		
		
		
		
		
		
		
	}
}
