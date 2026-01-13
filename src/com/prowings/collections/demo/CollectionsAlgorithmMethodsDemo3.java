package com.prowings.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsAlgorithmMethodsDemo3 {
	
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("Ram");
		myList.add("Sham");
		myList.add("Arun");
		myList.add("Sachin");
		myList.add("Pradip");
		myList.add("Abhinav");
		
		System.out.println("Before reverse :CollectionsAlgorithmMethodsDemo1.java " + myList);

		Collections.reverse(myList);
		
		System.out.println("After reverse : " + myList);
	}
}
