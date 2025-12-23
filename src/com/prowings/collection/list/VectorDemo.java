package com.prowings.collection.list;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector v1 = new Vector(10,3); //no-arg constructor
		
		System.out.println("Initial Capacity : "+v1.capacity());
		System.out.println("Current Size : "+v1.size());
		
		v1.add(123);
		v1.add("aaa");
		v1.add(345);
		v1.add(345);
		v1.add(null);
		v1.add("bbb");
		v1.add("ccc");
		v1.add("ccc");
		v1.add("ccc");
		v1.add(null);
		v1.add(null);
		
		System.out.println(v1);

		System.out.println("Initial Capacity : "+v1.capacity());
		System.out.println("Current Size : "+v1.size());
		
	}

}
