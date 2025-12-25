package com.prowings.collection.set;

public class TestEquality {
	
	
	public static void main(String[] args) {
		
		
		Student s1 = new Student(10, "Ram");

		Student s2 = new Student(10, "Ram");
//		Student s2 = s1;
		
		System.out.println("s1 == s2 : "+(s1==s2));
		
		System.out.println("Object class equals : "+ s1.equals(s2));
		
	}

}
