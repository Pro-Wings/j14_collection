package com.prowings.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsAlgorithmMethodsDemo8 {
	
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("Ram");
		myList.add("Sham");
		myList.add("Sham");
		myList.add("Arun");
		myList.add("Sham");
		myList.add("Sachin");
		myList.add("Pradip");
		myList.add("Sham");
		myList.add("Abhinav");
		
		System.out.println("Original List : " + myList);
		
		Collections.swap(myList, 0, 8);
		
		System.out.println("After swap List : " + myList);
		
		String key = "Sham";
		
		int occurance = Collections.frequency(myList, key);
		
		System.out.println(key + " occurred : "+occurance +" times!!");
	}
}
