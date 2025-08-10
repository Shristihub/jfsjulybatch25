package com.shristi.abs;

public class SubBranch extends Branch2{

	@Override
	void carLoan() {
		System.out.println("Car loan in Sub Branch");		
	}
	// own method
	void depositTypes() {
		System.out.println("SIP,recurring, short term");
	}

}
