package com.shristi.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudent {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jfsjulybatch";
		String username="root";
		String password="root";
		String query = "insert into student(student_name,city,department) values(?,?,?)";
		System.out.println("Enter Details");
		
		try(Scanner sc =  new Scanner(System.in);
			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement = connection.prepareStatement(query);){
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter name");
				String name = sc.next();
				statement.setString(1, name);
				
				System.out.println("Enter city");
				statement.setString(2, sc.next());
				
				System.out.println("Enter department");
				statement.setString(3, sc.next());
				
				boolean isInserted = statement.execute();
				System.out.println("Row Inserted "+!isInserted);
			}
		
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
	}

}
