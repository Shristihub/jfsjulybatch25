package com.streams.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class EmpStreams {

	public static void main(String[] args) {
		List<Employee> employees = 
				Arrays.asList(
					new Employee("Raju","Ooty",2000,1),
					new Employee("Jeni","Bengaluru",24000,2),
					new Employee("Kevin","Chennai",12000,3),
					new Employee("Akash","Ooty",8000,4),
					new Employee("Tina","Mysore",15000,5),
					new Employee("Sri","Mysore",8400,6));
	
//	1. get the list of employees from a particular city
	employees.stream()
	  .filter(emp->emp.getCity().equals("Mysore"))
	  .forEach(System.out::println);
//	2. print only the emp names in uppercase
	
//	3. get the employees having salary greater than 5000, sort by names and print them
	
//	4. get the highestsalary
	double highest = employees.stream()
		.mapToDouble(emp->emp.getSalary())
		.max()
		.getAsDouble();
	
	// get the employee with the highest salary
	   Employee  empl = employees.stream()
	   .max(Comparator.comparingDouble(Employee::getSalary))
	   .get();

//	5. get the sum of salaries of all employees
//	6. 8. Get a Map of Employee Names and their salaries
	
	
}















