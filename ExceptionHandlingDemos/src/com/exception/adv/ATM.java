package com.exception.adv;

public class ATM {

	public static void main(String[] args) throws Exception {
		System.out.println("in ATM");
		Bank bank =  new Bank();
		bank.withdraw(0);
		System.out.println("Amount withdrawn successfully");
		System.out.println("Goodbye");
	}
}
