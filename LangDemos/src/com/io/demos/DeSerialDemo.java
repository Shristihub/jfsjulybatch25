package com.io.demos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialDemo {

	public static void main(String[] args) {
		System.out.println("DeSerializing");
		//create an object of FleOutputStream
		try(FileInputStream fs = new FileInputStream("student.ser");
			ObjectInputStream os = new ObjectInputStream(fs);){
			Student student = (Student)os.readObject();
			System.out.println(student);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
