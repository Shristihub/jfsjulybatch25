package com.oops.override;

public class Car extends Vehicle {
	
	public Car(String model, String brand) {
		super(model, brand);
	}

	@Override
	 void getMileage() {
		super.getMileage();
		System.out.println("Excellent Mileage for car");
	}
	
	//own method of car
	void showAcc(){
		System.out.println("Seat cover,Car cover");
	}
	
	
}
