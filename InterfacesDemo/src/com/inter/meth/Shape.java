package com.inter.meth;


public class Shape {
    int x;
	
	public Shape(int x) {
		super();
		this.x = x;
	}

	void area() {
		System.out.println("Sq "+(x*x));
	}
}
