package com.prowings.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayListToArrayDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(123);
		al.add(345);
		al.add(123);
		
		
		Integer[] nums = al.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(nums));
	}
	
	
}
