package com.prowings.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(123);
		al.add("hiii");
		al.add(345);
		al.add("hello");
		
		System.out.println(al);
		
		HashSet hs = new HashSet();
		
		hs.add("abc");
		hs.add("pqr");
		
		System.out.println("Hashset elements : "+hs);
		
		al.addAll(hs);
		
		System.out.println("After addAll : "+al);
		
		al.remove("hiii");
		System.out.println("After remove : "+al);
//		al.removeAll(hs);
//		System.out.println("After removeAll : "+al);

		System.out.println("size : "+al.size());
		
		al.retainAll(hs);
		System.out.println("After retainAll : "+al);
		System.out.println("isEmpty : "+al.isEmpty());
		
//		al.clear();
//		System.out.println("After clear : "+al);
		
		ArrayList al2 = new ArrayList<>(al);
		
		System.out.println("ArrayList 1 : "+al);
		System.out.println("ArrayList 2 : "+al2);
		
		System.out.println(al.hashCode());
		System.out.println(al2.hashCode());
		
		System.out.println("Reference Equality : "+(al == al2));
		
		System.out.println(al.equals(al2));
	
		System.out.println("contains method : "+al.contains("abcd"));
		System.out.println("containsAll method : "+al.containsAll(al2));
		
		System.out.println("--------------");
		
		
		Object[] obArr = al.toArray();
		
		System.out.println(Arrays.toString(obArr));
		
	}
	
	
}
