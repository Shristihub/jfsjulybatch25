package com.inter.basics;

public class Client {


	public static void main(String[] args) {
		IPayment payment =  new NetBanking();
		System.out.println(payment.showPaymentMode());
		System.out.println(IPayment.CATEGORY);
		
		payment = new CreditCardPayment();
		System.out.println(payment.showPaymentMode());
		
		CreditCardPayment credit = (CreditCardPayment)payment;
		credit.showOffers();
		
		payment =  new DebitCardPayment();
		System.out.println(payment.showPaymentMode());
		
	
		
		
	}
}
