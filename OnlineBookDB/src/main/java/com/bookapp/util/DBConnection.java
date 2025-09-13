package com.bookapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {

	static Connection connection;

	public static Connection openConnection() {
		String url = "jdbc:mysql://localhost:3306/jfsjulybatch";
		String username = "root";
		String password = "root";
		String query = """
				create table Book(title varchar(30),
				book_id int primary key auto_increment,
				author varchar(20),category varchar(20),price float)
				""";

		// create a connection object
		try {
			connection = DriverManager.getConnection(url, username, password);
			PreparedStatement st = connection.prepareStatement(query); // close st in finally
			boolean isCreated = st.execute();
			System.out.println("Table created " + !isCreated);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}

	public static void closeConnection() {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
