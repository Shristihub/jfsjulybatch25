package com.exception.exercise;

public class A {
	public static void main(String[] args) {
		System.out.println("Started");
		try {
			B.method1();
		} catch (Exception e) {
			System.out.println("technical error....");
		}
		System.out.println("done");
	}
}

class B {
	static void method1() throws Exception  {
		System.out.println("hello");
		try {
			C.method2();
		} finally {
			System.out.println("close resource");
		}
		System.out.println("in class B");
	}
}

class C {
	static void method2() throws Exception {
		System.out.println("welcome");
		try {
			D.method3();
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			System.exit(0);
//			throw e;
			return;
		}finally {
			System.out.println("close");
		}
		System.out.println("in class c");
	}
}

class D {
	static void method3() throws Exception {
		System.out.println("in class D");
		throw new Exception("invaliid username and password");

	}
}