package com.set.demos;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
//		HashSet<String> set =  new HashSet<>();
//		LinkedHashSet<String> set =  new LinkedHashSet<>();
		TreeSet<String> set =  new TreeSet<>();
		System.out.println(set.size());
		set.add("Kevin");
		set.add("Ram");
		set.add("Tom");
		set.add("null");
		set.add("Kevin");
//		set.add(null);
		System.out.println(set);
	}

}
