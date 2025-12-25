package com.prowings.collection.set;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Student std1 = new Student(10, "Ram");
		Student std2 = new Student(10, "Ram");
		
		System.out.println(std1.equals(std2));
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		HashSet hs = new HashSet<>();
		
		hs.add(std1);
		hs.add(123);
		hs.add(std2);
		hs.add("hii");
		hs.add(123);
		hs.add("hii");
		
		System.out.println(hs);
		
	}

}
