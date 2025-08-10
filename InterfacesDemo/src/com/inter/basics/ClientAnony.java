package com.inter.basics;

public class ClientAnony {


	public static void main(String[] args) {
		IPayment payment =  new IPayment() {
			@Override
			public String showPaymentMode() {
				return "Using UPI";
			}
		};
	  System.out.println(payment.showPaymentMode());
	  
	  payment =  new IPayment() {
		
		@Override
		public String showPaymentMode() {
			return "Using netbanking";
		}
	};
	System.out.println(payment.showPaymentMode());
		
		
	}
}
