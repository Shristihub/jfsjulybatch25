package com.shristi.basics;

public class TypeConversion {
	static public void main(String[] args) {
		System.out.println("welcome");
		int x = 100;
		// upcasting
		long y = x * 2;
		double z = x + y;
		System.out.println(x + " " + y + " " + z);

		double g = 102.3;

		// downlasting
		float s = (float) g;
		long v = (long) (s + g);
		int a = (int) v;

		System.out.println(s + " " + v + " " + a);

	}
}
