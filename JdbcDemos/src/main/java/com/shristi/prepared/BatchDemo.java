package com.shristi.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDemo {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jfsjulybatch";
		String username="root";
		String password="root";
		String query = "insert into employee values(?,?,?)";
	
		try(Connection connection = DriverManager.getConnection(url, username, password);
			// Ist query
			PreparedStatement insertStatement = connection.prepareStatement(query);){
			insertStatement.setString(1,"John" );
			insertStatement.setInt(2, 104);
			insertStatement.setString(3, "Tech");
			insertStatement.addBatch();
			
			insertStatement.setString(1,"Raju" );
			insertStatement.setInt(2, 105);
			insertStatement.setString(3, "Tech");
			insertStatement.addBatch();
			
			insertStatement.setString(1,"Banu" );
			insertStatement.setInt(2, 106);
			insertStatement.setString(3, "Tech");
			insertStatement.addBatch();
			insertStatement.executeBatch();//returns an array -iterate to check if inserted
			
			query = "update employee set department=? where employee_Id=?";
			try(PreparedStatement updateStatement = connection.prepareStatement(query);){
			updateStatement.setString(1, "Mktg");
			updateStatement.setInt(2, 104);
			updateStatement.addBatch();
			updateStatement.executeBatch();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
