package com.prowings.collection.list;

import java.util.ArrayList;

public class RemoveMethodDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("abc");
		al.add("hii");
		al.add("abc");
		al.add(123);
		al.add("abc");
		al.add(456);
		
		System.out.println(al.get(3));
		
		System.out.println(al.set(1, "hello"));
		
		System.out.println(al);
		
		System.out.println(al.lastIndexOf("abc"));
		
		System.out.println("Before : "+al);
		al.add(3, "xyz");
		System.out.println("After : "+al);

		System.out.println("Before : "+al);
		al.remove(3);
		System.out.println("After : "+al);
		
		System.out.println("-----------------------------");
		
		System.out.println("Before sublist : "+al);
		
		ArrayList al2 = new ArrayList(al.subList(0, 2));
		al = null;
		System.out.println("After sublist : "+al);
		
	}

}
