package com.oops.override;

import java.util.Scanner;

public class Showroom {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("a", "b");
		vehicle.getMileage();
		System.out.println(vehicle.type); //luxury
		
		// super class ref = sub class object
		vehicle = new Car("Honda","City");
		vehicle.getMileage(); // calls the method of car
		System.out.println(vehicle.type); 
				
		vehicle  = new Bike("Honda","A123");
		vehicle.getMileage();
		System.out.println(vehicle.type);
		
		// own method
		Bike bike = (Bike)vehicle;
		bike.printType();
		
		// own method
//		Car car  = (Car) vehicle;
//		car.showAcc();
		
		
		
		

	}
}
