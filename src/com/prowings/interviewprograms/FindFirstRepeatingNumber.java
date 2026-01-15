package com.prowings.interviewprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatingNumber {
	
	public static void main(String[] args) {
		
		Integer[] nums = {10,20,30,10,50,40,20,50};
		
		Integer res = findFirstRepeatingNum(nums);

		System.out.println("Original numbers : "+Arrays.toString(nums));
		System.out.println("First repeating num from given array : "+res);
	}

	public static Integer findFirstRepeatingNum(Integer[] nums) {
		Set<Integer> uniqNums = new HashSet<>();
		Integer firstRepeatedNum = 0;
		for(Integer n :nums)
		{
			if(!uniqNums.add(n))
			{
				firstRepeatedNum = n;
				break;
			}
		}
		return firstRepeatedNum;
	}

}
 