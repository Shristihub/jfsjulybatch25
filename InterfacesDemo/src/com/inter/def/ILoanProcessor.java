package com.inter.def;
@FunctionalInterface
public interface ILoanProcessor {
	void calculate();
	default  void process() {
		System.out.println("processing for loan....");
	}

}
