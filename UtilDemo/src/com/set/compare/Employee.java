package com.set.compare;

public class Employee implements Comparable<Employee> {

	private String empName;
	private String city;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, String city, double salary) {
		super();
		this.empName = empName;
		this.city = city;
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", city=" + city + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Employee o) {
//		return this.getEmpName().compareTo(o.getEmpName());
//		return this.getCity().compareTo(o.getCity());
		Double sal = o.getSalary(); // autoboxing
//		return sal.compareTo(this.getSalary()); //reverse sorting descending
		
//		return Double.compare(this.getSalary(), o.getSalary());
		
		int val = o.getCity().compareTo(this.getCity()); 
		if(val == 0)
			return 	this.getEmpName().compareTo(o.getEmpName());
		return val;
	}
	
	
}







