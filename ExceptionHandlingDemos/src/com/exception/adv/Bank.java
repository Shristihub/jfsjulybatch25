package com.exception.adv;

public class Bank {
	double balance = 8000;

	void withdraw(int amount) throws Exception{
		System.out.println("In Bank");
		try {
			if (amount <= 0) {
				throw new Exception("amount should be greater than 0");
			}
			balance -= amount;
			System.out.println("Balance" + balance);
		} catch (Exception e) {
			System.out.println("technical error....");
			System.out.println(e.getMessage());
			throw e;
		} finally {
			System.out.println("close db");
		}
		System.out.println("Task completed");
	}
}
