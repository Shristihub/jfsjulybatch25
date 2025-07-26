package com.shristi.basics;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter choice");
		String climate=sc.next();
		//accepts expression that can be an int value,String, enum
		switch(climate.toUpperCase()) {
		case "RAINY":
			System.out.println("Drink tea");
			System.out.println("Enjoy rain");
			break;
		case "WINTER":
			System.out.println("Drink soup");
			System.out.println("sleep cozy");
			break;
		case "SUMMER":
			System.out.println("Have icecream");
			System.out.println("Stay at home");
			break;
		default:
			System.out.println("incorrect choice");
		}
	}
}



