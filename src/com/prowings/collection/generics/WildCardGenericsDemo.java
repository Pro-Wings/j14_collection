package com.prowings.collection.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WildCardGenericsDemo {
	
	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("aaa");
		al.add("bbb");
		al.add("aaa");
		al.add("ddd");
		
		List<Integer> al2 = new ArrayList<>();
		al2.add(123);
		al2.add(123);
		al2.add(123);
		al2.add(123);
		al2.add(123);
		
		
//		printList(al);
		printList(al2);
		
		
	}

	public static void printList(List<? extends Number> al) {
		
		Iterator<?> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
