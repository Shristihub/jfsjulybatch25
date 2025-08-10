package com.inter.def;

public interface IBonusCalculator {
	void calculate();
	default  void process() {
		System.out.println("processing for bonus....");
		check();
	}
	private void check() {
		System.out.println("check documents");
	}

}
