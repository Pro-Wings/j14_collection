package com.prowings.collection.set;

import java.util.HashMap;
import java.util.Scanner;

public class WordOccuranceProgram {
	
	public static void main(String[] args) {
		
		//Write a program which should accept a String, and give output as - Occurrence of each word from given string
		/*
		 * Ex. Input : "India is my country India is beautiful country"
		 * 
		 * 	   Output : 
		 *   		India - 2
		 *   		is    - 2
		 *   		my    - 1
		 *   		country-2
		 *   		beautiful-1
		 */
		
		System.out.println("Enter a String Line : ");
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println("You have entered Line : "+input);
		
		calculateWordOccurrance(input);
		
	}

	public static void calculateWordOccurrance(String input) {
		
		//step1 - split the incoming string into words
		String[] words = input.split(" ");
		
		//step2 - create a HashMap with String as Key and Integer as Value
		
		HashMap<String, Integer> wordsMap = new HashMap<>();
		
		for(String word : words)
		{
			if(!wordsMap.containsKey(word))
			{
				wordsMap.put(word, 1);
			}
			else
			{
				int oldValue = wordsMap.get(word);
				wordsMap.put(word, oldValue+1);
			}
		}
		
		System.out.println(wordsMap);
	}

}
