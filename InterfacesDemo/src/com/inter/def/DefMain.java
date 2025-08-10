package com.inter.def;

public class DefMain {

	public static void main(String[] args) {
		IBonusCalculator bonusCalculator =  new Employee();
		bonusCalculator.calculate();
		bonusCalculator.process();
		
		ILoanProcessor processor = (ILoanProcessor)bonusCalculator;
		processor.calculate();
	
	}
}
