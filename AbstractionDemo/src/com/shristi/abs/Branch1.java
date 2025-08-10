package com.shristi.abs;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("Car loan in Branch1");
	}

	@Override
	void housingLoan() {
		System.out.println("Housing loan in Branch1");
	}

	@Override
	void eduLoan() {
		System.out.println("Education loan in Branch1");
	}
	
	//own method
	void payDetails() {
		System.out.println("bonus payment for employees ");
	}

}
