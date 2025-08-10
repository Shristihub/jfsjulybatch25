package com.shristi.abs;

public abstract class Bank {

	abstract void carLoan();
	abstract void housingLoan();
	abstract void eduLoan();
	final void adminDetails() {
		System.out.println("Rules for Bank employees");
	}
}
