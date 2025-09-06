package com.io.demos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileToFileDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("reading");
		// read from File and write to file
		try (FileReader reader = new FileReader("demo.txt");
			 FileWriter fileWriter = new FileWriter("demo1.txt");){
			int val=0;
			do {
				// read from file write into file
				val = reader.read();
				fileWriter.write(val);
			}while(val != -1);
		} 
	}
}
