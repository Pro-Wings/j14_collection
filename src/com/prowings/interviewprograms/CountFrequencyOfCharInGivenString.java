package com.prowings.interviewprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfCharInGivenString {
	
	public static void main(String[] args) {
		
		String input = "hello";
		
		/*
		 * o/p : 
		 * 
		 * h = 1
		 * e = 1
		 * l = 2
		 * o = 1
		 */
		Map<Character, Integer> charCount = countCharFrequency(input);
		
		System.out.println(charCount);
	}

	public static Map<Character, Integer> countCharFrequency(String input) {
		
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		
		char[] chars = input.toCharArray();
		
		for(char c : chars)
		{
			if(!charCount.containsKey(c))
				charCount.put(c, 1);
			else
			{
				Integer oldVal = charCount.get(c);
				charCount.put(c, oldVal+1);
			}
		}
		
		return charCount;
	}

}
