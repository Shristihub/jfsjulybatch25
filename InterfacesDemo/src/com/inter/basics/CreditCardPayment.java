package com.inter.basics;

public class CreditCardPayment extends CardPayment{

	@Override
	public String showPaymentMode() {
		// TODO Auto-generated method stub
		return "credit card";
	}
	
	void showOffers(){
		System.out.println("Discount above 1000rs");
	}

}
