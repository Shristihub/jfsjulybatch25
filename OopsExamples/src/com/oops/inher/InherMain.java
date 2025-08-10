package com.oops.inher;


public class InherMain {

	public static void main(String[] args) {
		InEmployee employee = new InEmployee("Raju",10);
		employee.getDetails();
		InManager manager =  new InManager("Kevin",20,2000.0);
		manager.getDetails();
	}
}
