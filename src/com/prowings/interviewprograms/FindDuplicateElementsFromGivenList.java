package com.prowings.interviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElementsFromGivenList {
	
	public static void main(String[] args) {
		
		Integer[] nums = {10,20,30,10,30,40,20,50};
		
		List<Integer> duplicateNums = findDuplicates(nums);

		System.out.println("Original numbers : "+Arrays.toString(nums));
		System.out.println("Duplicates from given array : "+duplicateNums);
	}

	public static List<Integer> findDuplicates(Integer[] nums) {
		
		List<Integer> result = new ArrayList<>();
		
		Set<Integer> uniqNums = new HashSet<>();
		
		for(Integer n :nums)
		{
			if(!uniqNums.add(n))
			{
				result.add(n);
			}
		}
		return result;
	}

}
 