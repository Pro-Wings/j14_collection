package com.prowings.collection.list;

import java.util.ArrayList;

public class ArrayListIteration {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(123);
		al.add(345);
		
		Integer result = 0;
	
		for(Integer o : al)
		{
			result = result + o;
		}
		
		System.out.println(result);
		
	}

}
