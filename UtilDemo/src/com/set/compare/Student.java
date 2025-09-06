package com.set.compare;

public class Student {

	private String studentName;
	private String city;
	private int studentId;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, String city, int studentId) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", studentId=" + studentId + "]";
	}
	
	
	
	
}
