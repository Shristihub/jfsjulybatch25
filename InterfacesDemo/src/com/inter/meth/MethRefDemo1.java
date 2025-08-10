package com.inter.meth;

public class MethRefDemo1 {

	public static void main(String[] args) {
		//class that implements the interface
		ShapeFactory factory = new ShapeFactoryImpl();
		//get the shape from factory class
		Shape shape = factory.getShape(10);
//		Shape shape =  new Shape(10);
		shape.area();
		
		//lambda expression
		ShapeFactory factory1 = x-> new Shape(x);
		//get the shape from factory class
		Shape shape1 = factory1.getShape(10);
		shape1.area();
		
		// referring to a constructor to get an object
		//implementation
		ShapeFactory factory2 = Shape::new;
		//call the method to get shape object
		Shape shape2 = factory2.getShape(100);
		shape2.area();
		
		
		
	}
}
