package com.io.demos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFileDemo {

	public static void main(String[] args) {
//		File file =  new File("demo.txt");
//		file.createNewFile();
		
		// read from console and covert byte to char
		InputStreamReader in = new InputStreamReader(System.in);
		// buffer the characters that are read
		BufferedReader br = new BufferedReader(in);
		FileWriter fileWriter = null;
		try {
			// create a file writer
//			fileWriter = new FileWriter("demo.txt");
			// read from bufferedreader
			int val = br.read();
			System.out.print((char) val); // prints the char
			// write into file
			fileWriter.write(val);
			while((char) val != 'q') {
				val = br.read();
				System.out.print((char) val); // prints the char
				// write into file
				fileWriter.write(val);
			
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if(fileWriter!=null)
					fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
