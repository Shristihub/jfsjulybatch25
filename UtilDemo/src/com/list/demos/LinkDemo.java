package com.list.demos;

import java.util.LinkedList;

public class LinkDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		System.out.println(list.size());
		list.add("Ram");
		list.add("Tom");
		list.addFirst("Kathy");
		System.out.println(list);
//		list.add(1,"Poppy");
//		System.out.println(list);
//		list.add("Tom");
//		list.set(0, "Kevin");
		System.out.println(list);
		System.out.println(list.size());
		for(String s:list) {
			System.out.println(s.toUpperCase());
		}
		System.out.println();
		
		System.out.println(list.element());
		System.out.println(list);
		
		System.out.println(list.removeLast());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list.peek());
		//throws exception
//		System.out.println(list.remove());
//		System.out.println(list.element());
		
	}
}
