package com.prowings.collection.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WildCardGenericsDemo2 {
	
	public static void main(String[] args) {
		
		List<Object> al = new ArrayList<>();
		al.add("aaa");
		al.add("bbb");
		al.add("aaa");
		al.add("ddd");
		
		List<Number> al2 = new ArrayList<>();
		al2.add(123L);
		al2.add(123L);
		al2.add(123L);
		
		
		printList(al);
		printList(al2);
		
		
	}

	public static void printList(List<? super Number> al) {
		
		Object n = al.get(0);
		System.out.println();
		
		
		Iterator<?> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
