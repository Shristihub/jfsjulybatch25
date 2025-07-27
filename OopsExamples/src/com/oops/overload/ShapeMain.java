package com.oops.overload;

public class ShapeMain {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.area(10);
		shape.area(20.0f);
		int rec = (int) shape.area(10, 20);
		System.out.println("Rect " +rec);
		double tri = shape.area(1, (int)2.0f);
		System.out.println("Tri "+tri);
		
	}

}
