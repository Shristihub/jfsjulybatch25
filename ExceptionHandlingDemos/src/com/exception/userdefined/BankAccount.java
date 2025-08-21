package com.exception.userdefined;

public class BankAccount {
	double balance;
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	
	void withdraw(int amount) throws ExceedingLimitsException, InSufficientBalanceException{
		System.out.println("in bank");
		if(amount>=5000)
			throw new ExceedingLimitsException("Exceeding withdrawl limit. should be <2000");
		if(balance-amount<=2000)
			throw new InSufficientBalanceException("insufficient balance");
		balance-=amount;
		System.out.println("Balance "+balance);
		
		System.out.println("Task completed");
	}

}