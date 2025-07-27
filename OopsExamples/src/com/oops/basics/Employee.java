package com.oops.basics;

public class Employee {
    String employeeName;
    int employeeId;
    double salary;
	
    void getDetails() {
    	System.out.println("Name "+employeeName);
		System.out.println("Id "+employeeId);
		System.out.println("Salary "+salary);
		
    }
    
    String greet(String message) {
    	return message + employeeName;
    }

}
