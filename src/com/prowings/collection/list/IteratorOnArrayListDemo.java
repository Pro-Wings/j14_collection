package com.prowings.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorOnArrayListDemo {
	
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
		Iterator itr = al.iterator(); 
		
		//Step 2: Iterate collection over a loop
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
			//This is a structural modification
			//al.add("qqq");
			//al.remove(0);
			
			//Non-structural modification operation
			al.set(3, "hello-world");
			
			//This is a safe structural operation - because this operation is supported by Iterator itself.
			//itr.remove(); 
		}
		
	}

}
