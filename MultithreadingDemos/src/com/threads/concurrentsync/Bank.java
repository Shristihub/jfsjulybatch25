package com.threads.concurrentsync;

public class Bank {
	double calcInterest(String name,double principal){
		System.out.println("Welcome "+name);
		double interest = (principal*5*2)/100;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Interest for "+name+ " : "+interest);
		return interest;
	}
	
	void payBills(double amount) {
		System.out.println("Paying bills "+amount);
	}

}
