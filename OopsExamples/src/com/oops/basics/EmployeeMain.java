package com.oops.basics;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1= new Employee();
		//assign values
		employee1.employeeName = "Priya";
		employee1.employeeId = 10;
		employee1.salary = 2000;
		
		//call the methods
		employee1.getDetails();
		String result =employee1.greet("Hello");
		System.out.println(result);
		System.out.println();
		
		Employee employee2= new Employee();
		//assign values
		employee2.employeeName = "Sri";
		employee2.employeeId = 20;
		employee2.salary = 3000;
		employee2.getDetails();
		System.out.println(employee2.greet("welcome"));
		
		
		
		
//		Employee employee3 = employee2;
//		System.out.println("emp3 name "+employee3.employeeName);
//		System.out.println("emp2 name "+employee2.employeeName);
//		//make employee2 as null
//		employee2=null;
//		System.out.println("emp2 name "+employee2.employeeName);
//		System.out.println("emp3 name "+employee3.employeeName); // this will not be executed
//		
		
	}
	
}
