package com.prowings.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashsetConverionConstructorDemo {
	
	public static void main(String[] args) {
		
		Integer[] nums = {99,12,34,12,99,54,87,99};
		
		System.out.println("Before removing duplicates : "+Arrays.toString(nums));

		Integer[] uniqNumbers = removeDuplicates(nums);
		
		System.out.println("After removing duplicates : "+Arrays.toString(uniqNumbers));
	}

	
	public static Integer[] removeDuplicates(Integer[] numbers)
	{
		//step1 - convert array into List
		List list = Arrays.asList(numbers);
		
		//step2 - convert list into set
		HashSet hs = new HashSet(list);

		//step3 - convert Hashset into array
		Integer[] res = (Integer[]) hs.toArray(new Integer[0]);
		
		return res;
		
//		return new HashSet<>(Arrays.asList(numbers)).toArray(new Integer[0]);
		
	}
	
}
