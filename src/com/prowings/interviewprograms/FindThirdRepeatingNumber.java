package com.prowings.interviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindThirdRepeatingNumber {
	
	public static void main(String[] args) {
		
		Integer[] nums = {10,20,30,10,50,40,20,50};
		
		Integer res = findThirdRepeatingNum(nums);

		System.out.println("Original numbers : "+Arrays.toString(nums));
		System.out.println("Third repeating num from given array : "+res);
	}

	public static Integer findThirdRepeatingNum(Integer[] nums) {
		Set<Integer> uniqNums = new LinkedHashSet<>();
		List<Integer> repeatedNums = new ArrayList<>();

		for(Integer n :nums)
		{
			if(!uniqNums.add(n))
			{
				repeatedNums.add(n);
			}
		}
		return repeatedNums.get(2);
	}

}
 