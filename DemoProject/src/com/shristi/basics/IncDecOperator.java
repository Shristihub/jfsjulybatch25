package com.shristi.basics;

public class IncDecOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int x = ++a + b++ + ++c;
		System.out.println(a+" "+b+" "+c+" "+x);//11 21 31 62
		int y = --x + b-- + 10; //
		System.out.println(b+" "+x+" "+y);
		int z = y++ * 2;
		System.out.println(a+" "+b+" "+c+" "+x);
	}

}
