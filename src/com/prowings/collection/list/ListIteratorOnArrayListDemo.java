package com.prowings.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorOnArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(123);
		al.add("hii");
		al.add(345);
		al.add("hello");
		al.add(789);
		al.add("abc");
		
		System.out.println("Contents of AL : "+al);
		
		//Step 1: Obtain object of Iterator
//		ListIterator ltr = al.listIterator(); //iteration will start from 0th index.
		ListIterator ltr = al.listIterator(3); //iteration will start from specified index
		
		//Step 2: Iterate collection over a loop
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("out of listiterator!!");
		System.out.println("Contents of AL : "+al);
		
	}

}
