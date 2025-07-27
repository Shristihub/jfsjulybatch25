package com.oops.overload;

public class VarArgsDemo {
	static public  void main(String[] args) {
		sum();
		sum(90,80);
		sum(90,80,70);
		sum(90,80,90,90);
	}
	static void sum(int x, int y) {
		System.out.println(x*y);
	}
	static void sum(int... marks) {
		System.out.println(marks.length);
		int sum = 0;
		for (int mark : marks) {
			sum +=mark;
		}
		System.out.println("Sum "+sum);
	}
	
	
}
