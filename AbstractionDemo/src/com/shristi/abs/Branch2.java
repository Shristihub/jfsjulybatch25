package com.shristi.abs;

public abstract class Branch2 extends Bank{

	@Override
	void housingLoan() {
		System.out.println("Housing loan in Branch2");
	}

	@Override
	void eduLoan() {
		System.out.println("Education loan in Branch2");
	}
	//own method
	void loanTypes() {
		System.out.println("for agriculture, small business, shops");
	}

}
