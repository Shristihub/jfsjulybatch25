package com.oops.st;

public class DBConnection {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.oops.st.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
