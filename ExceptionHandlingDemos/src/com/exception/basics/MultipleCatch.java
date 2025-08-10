package com.exception.basics;

public class MultipleCatch {

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
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Dont enter 0");
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("Dont enter String value");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("enter value");
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
