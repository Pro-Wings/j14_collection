package com.prowings.interviewprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfWordsInGivenString {
	
	public static void main(String[] args) {
		
		String input = "hello java developers welcome to java world hello";
		
		/*
		 * o/p : 
		 * 
		 * hello = 2
		 * java = 2
		 * developers = 1
		 * welcome = 1
		 * to = 1
		 * world = 1
		 */
		Map<String, Integer> wordCountMap = countWordFrequency(input);
		
		System.out.println(wordCountMap);
	}

	public static Map<String, Integer> countWordFrequency(String input) {
		
		Map<String, Integer> wordCount = new LinkedHashMap<>();
		
		String[] words = input.split(" ");
		
		for(String w : words)
		{
			if(!wordCount.containsKey(w))
				wordCount.put(w, 1);
			else
			{
				Integer oldVal = wordCount.get(w);
				wordCount.put(w, oldVal+1);
			}
		}
		
		return wordCount;
	}

}
