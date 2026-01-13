package com.prowings.interviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondHighestElement2 {

	public static void main(String[] args) {
		
		Integer[] nums = {10,70,20,70,50,60,60,40,30};
		List<Integer> numbers = Arrays.asList(nums);
		
		System.out.println(numbers);
		
		int secondHighest = getSecondHighest(numbers);
		
		System.out.println("Second Highest Number : "+secondHighest);

	}

	public static int getSecondHighest(List<Integer> numbers) {
//		Collections.sort(numbers);
		Set<Integer> uniqueNums = new TreeSet<>(numbers);
		
		List<Integer> uniqNums = new ArrayList<>(uniqueNums);
		
		System.out.println(uniqNums);
		
		return new ArrayList<>(uniqueNums).get(uniqNums.size()-2);
	}
}