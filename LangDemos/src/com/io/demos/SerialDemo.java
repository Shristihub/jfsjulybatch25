package com.io.demos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) {
		System.out.println("Serializing");
		Student student =  new Student("Sri", 10, "ECE");
		//create an object of FleOutputStream
		try(FileOutputStream fs = new FileOutputStream("student.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);){
			os.writeObject(student);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
