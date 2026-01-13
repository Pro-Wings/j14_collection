package com.prowings.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodiableWrappersDemo {
	
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("Ram");
		myList.add("Sham");
		myList.add("Sham");
		myList.add("Arun");
		myList.add("Sachin");
		myList.add("Pradip");
		myList.add("Abhinav");

		List<String> fixedList = createUnmodifiableView(myList);
		
		System.out.println("received unmodified list : "+fixedList);
		
		System.out.println(fixedList.get(2)); //read operation
		System.out.println(fixedList.set(2,"aaaa")); //write operation
	}

	public static List<String> createUnmodifiableView(List<String> myList) {
		
		return Collections.unmodifiableList(myList);
	}

}
