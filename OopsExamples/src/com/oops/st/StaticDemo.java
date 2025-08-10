package com.oops.st;
//import static members pkg.subpkg.subpkg.class.*;
import static com.oops.st.Trial.*;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class StaticDemo {
	static int x=100;
	static {
		System.out.println("demo static block1");
	}
	static {
		System.out.println("demo static block2");
	}
	static void sayHello(){
		System.out.println("Hello!!");
	}
	public static void main(String[] args) {
		greet();
		System.out.println("Value "+x);
		System.out.println("Sum "+(x+y));
		int a = parseInt("100");
		
		
	}
	
}
