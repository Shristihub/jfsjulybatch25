package com.oops.encap;


// java bean - public class, with private instance variables,
//public default constr, public getter /setter methods
public class Product {

	private String productName;
	private int productId;
	private double price;
	private boolean expired;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isExpired() {
		return expired;
	}
	public void setExpired(boolean expired) {
		this.expired = expired;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", expired=" + expired + "]";
	}
	
	
	
}
