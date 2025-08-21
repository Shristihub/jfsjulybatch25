package com.threads.sync;


class Counter implements Runnable{
	String customerName;
	double amount;
	LoanDetails details; 
	
	public Counter(String customerName, double amount,LoanDetails details) {
		super();
		this.customerName = customerName;
		this.amount = amount;
		this.details = details;
		Thread thread = new Thread(this,customerName);
		thread.start();
	}
	@Override
	public void run() {
	 synchronized (details) {
	    System.out.println("Interest Calculation for "+customerName);
		double interest = details.calcInterest(customerName, amount);
		System.out.println("Interest "+interest+" Goodbye");
		System.out.println();
	 }
	}
}

public class CustomerMain {

	public static void main(String[] args) {
		//shared resource
		LoanDetails details = new LoanDetails();
		Counter counter1 = new Counter("Kevin",10000,details);
		Counter counter2 = new Counter("Jacob",20000,details);
		Counter counter3 = new Counter("Rahul",30000,details);
		
		
		
	}
}
