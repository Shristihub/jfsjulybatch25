package com.exception.basics;

public class TryDemo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
		String value = args[0]; //AIOOB
		System.out.println("Value "+value);
		int num = Integer.parseInt(value); //NumberFormatException
		System.out.println("num "+num);
		int result = 100/num; //ArithmeticException
		System.out.println(result);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("Task completed");
		
	}
}
