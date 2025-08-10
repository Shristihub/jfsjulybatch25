package com.inter.def;

public class Employee implements IBonusCalculator,ILoanProcessor{

	@Override
	public void calculate() {
		System.out.println("calculation for employee");
	}

	@Override
	public void process() {
		System.out.println("process for bonus and loan for employee");
	}


}
