package com.inter.meth;

public class ShapeFactoryImpl implements ShapeFactory{

	@Override
	public Shape getShape(int x) {
		return new Shape(x);
	}

}
