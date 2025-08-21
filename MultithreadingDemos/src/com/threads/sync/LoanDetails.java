package com.threads.sync;

public class LoanDetails {

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
}
