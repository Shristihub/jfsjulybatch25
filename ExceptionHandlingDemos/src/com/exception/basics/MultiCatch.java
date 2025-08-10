package com.exception.basics;

public class MultiCatch {

	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			String value = args[0]; // AIOOB
			System.out.println("Value " + value);
			int num = Integer.parseInt(value); // NumberFormatException
			System.out.println("num " + num);
			int result = 100 / num; // ArithmeticException
			System.out.println(result);
			int[] marks = null;
			System.out.println(marks[1]);
		} catch (ArithmeticException | NumberFormatException |ArrayIndexOutOfBoundsException| NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("please enter num greater than 0");
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println("runtime exception");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("other exception");
		}
		System.out.println("Task completed");

	}
}
