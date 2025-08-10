package com.inter.basics;

public class UPIPayment implements IPayment{

	@Override
	public String showPaymentMode() {
		return "using gpay/phonepay"  ;
	}

	
}
