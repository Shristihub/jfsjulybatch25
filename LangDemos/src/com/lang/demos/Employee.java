package com.lang.demos;

import java.util.Objects;

public class Employee implements Cloneable{

	private String empName;
	private int employeeId;
	private String city;
	public Employee(String empName, int employeeId, String city) {
		super();
		this.empName = empName;
		this.employeeId = employeeId;
		this.city = city;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	protected Employee clone() throws CloneNotSupportedException {

		return (Employee)super.clone();
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(empName, employeeId);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(empName, other.empName)
//				&& employeeId == other.employeeId;
//	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", employeeId=" + employeeId + ", city=" + city + "]";
	}
	
	
}
