package com.lang.demos;

public class HashDemo {

	public static void main(String[] args) {
		String s1 ="Ram";
		String s2 ="hello";
		String s3 ="Ram";
		String s4 ="aRm";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
