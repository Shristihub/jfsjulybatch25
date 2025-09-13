package com.shristi.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;

public class RetrieveStudent {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jfsjulybatch";
		String username="root";
		String password="root";
		String query = "select * from student";

		try(Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement st = connection.prepareStatement(query);
			//create a ResultSet object
			ResultSet rs = st.executeQuery();){
			
			//create an ArrayList to store student objects
			ArrayList<Student> students =  new ArrayList<>();
			
			while(rs.next()) {
				String studentName = rs.getString("student_name");
				int studentId = rs.getInt(2); //column number
				String department = rs.getString("department");
				String city =  rs.getString("city");
				System.out.println(studentName+"\t"+studentId+"\t"+department+"\t"+city);
				//create the student object
				Student student =  new Student(studentName, studentId, department, city);
				//add the student object to the list
				students.add(student);
			}
			System.out.println();
			students.stream()
//				 .sorted((s1,s2)->s1.getStudentName().compareTo(s2.getStudentName()))
				 .sorted(Comparator.comparing(Student::getStudentName))
				 .forEach(System.out::println);
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
