package com.lang.demos;

public class EmpHashDemo {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Ram", 1,"Bengaluru");
		Employee employee2 = new Employee("Ram", 1,"Chennai");
		Employee employee3 = new Employee("Ram", 10,"Bengaluru");
		
		System.out.println(employee1.equals(employee2));
		System.out.println(employee1.equals(employee3));
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		
		
		
	}
}
