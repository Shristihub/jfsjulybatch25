package com.lang.demos;

public class EmpCloneDemo {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Ram", 1,"Bengaluru");
		try {
			Employee clonedEmployee = employee1.clone();
			System.out.println(clonedEmployee);
			System.out.println(clonedEmployee==employee1); //false
			System.out.println(employee1.getClass());
			System.out.println(clonedEmployee.getClass()==employee1.getClass()); //true
			System.out.println(clonedEmployee.equals(employee1));
			clonedEmployee.setEmpName("Sri");
			System.out.println(employee1);
			System.out.println(clonedEmployee);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
