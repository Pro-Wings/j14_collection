package com.prowings.collection.list;

import java.util.ArrayList;

public class ArrayListOwnMethodsDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(123);
		al.add("hii");
		al.add(345);
		al.add("hello");
		al.add(789);
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("abc");

		
		m1(al);
		
		
		
	}

	public static void m1(ArrayList al) {
		
		System.out.println("incoming list : "+al);
		
		al.ensureCapacity(50);
		//now add 50 more elements on top of it
		al.add(1111); //---1st reallocation
		al.add(1111);
		al.add(1111);
		al.add(1111);
		al.add(1111);
		al.add(1111);//---2nd reallocation
		al.add(1111);
	}


}
