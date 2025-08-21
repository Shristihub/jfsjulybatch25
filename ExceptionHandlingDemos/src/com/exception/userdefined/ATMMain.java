package com.exception.userdefined;

public class ATMMain {

	public static void main(String[] args)  {
		System.out.println("in ATM");
		BankAccount bank =  new BankAccount(5000);
		try {
			bank.withdraw(4000);
			System.out.println("Amount withdrawn successfully");
		} catch (ExceedingLimitsException | InSufficientBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Goodbye");
	}
}
