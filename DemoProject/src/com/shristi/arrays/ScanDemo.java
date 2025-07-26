package com.shristi.arrays;

import java.util.Scanner;

public class ScanDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter details");
		String empName = sc.next();
		System.out.println("Name "+empName);
		int empId =  sc.nextInt();
		System.out.println("EmpId "+empId);
		double salary =  sc.nextDouble();
		System.out.println("Salary "+salary);
	}

}
