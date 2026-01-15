package com.prowings.interviewprograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindFirstNonRepeatedCharFromGivenString {
	
	public static void main(String[] args) {
		
		String input = "abcbda";
		
		char firstNonRepeatedChar = findFirstNonRepeatedChar(input);
		
		System.out.println("Input String : "+input);
		System.out.println("first Non Repeated Char is : "+firstNonRepeatedChar );
		
		findFirstNonRepeatedCharUsingAscii(input);
		
	}

	public static char findFirstNonRepeatedChar(String input) {
		
		char[] chars = input.toCharArray();
		char firstNonRepeatChar = 0;
		LinkedHashMap<Character, Integer> charWithFrequency = new LinkedHashMap<>(); 
		
		for(char c : chars)
		{
			if(!charWithFrequency.containsKey(c))
			{
				charWithFrequency.put(c, 1);
			}
			else
			{
				int oldVal = charWithFrequency.get(c);
				charWithFrequency.put(c, oldVal+1);
			}
		}
		System.out.println(charWithFrequency);
		
		Set<Map.Entry<Character, Integer>> entries = charWithFrequency.entrySet();
		
		for(Map.Entry<Character, Integer> entry : entries)
		{
			if(entry.getValue() == 1)
			{
				firstNonRepeatChar =entry.getKey();
				break;
			}
			
		}
		return firstNonRepeatChar;
		
	}

	public static void findFirstNonRepeatedCharUsingAscii(String str)
	{
		int[] freq = new int[256];

		for (char c : str.toCharArray()) {
		    freq[c]++;
		}

		for (char c : str.toCharArray()) {
		    if (freq[c] == 1) {
		        System.out.println(c);
		        break;
		    }
		}
	}
	
}
