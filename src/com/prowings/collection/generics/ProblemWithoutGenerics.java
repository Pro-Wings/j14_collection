package com.prowings.collection.generics;

import java.util.ArrayList;

public class ProblemWithoutGenerics {
	
	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList();
		
		words.add("hii");
//		words.add(12345);
		words.add("hello");
		words.add("pro-wings");
		
		System.out.println("input list : "+words);
		
		ArrayList wordLenthList = calculateLengthOfEachWord(words);
		
		System.out.println(wordLenthList);
	}

	public static ArrayList calculateLengthOfEachWord(ArrayList<String> words) {
		
		ArrayList wordLengthCount = new ArrayList<>();
		
		for(String word : words)
		{
			//downcasting
				int wordLength = word.length();
				wordLengthCount.add(wordLength);
		}
		
		return wordLengthCount;
	}

}
