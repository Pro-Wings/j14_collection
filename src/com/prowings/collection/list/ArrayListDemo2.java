package com.prowings.collection.list;

import java.util.ArrayList;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		
		al1.add(123);
		al1.add("hii");
		al1.add(345);
		al1.add("hello");
		
		System.out.println("Al1 : "+al1);
		
		ArrayList al2 = new ArrayList(al1); //conversion constructor!!
		
		System.out.println("Al2 : "+al2);
		
		al1.add("abc");

		System.out.println("--------------------------");
		System.out.println("Al1 : "+al1);
		System.out.println("Al2 : "+al2);
		
	}
	
	
}
