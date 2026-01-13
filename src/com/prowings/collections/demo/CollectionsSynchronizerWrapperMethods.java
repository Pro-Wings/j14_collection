package com.prowings.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsSynchronizerWrapperMethods {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);
		
		List<Integer> syncNumbers = Collections.synchronizedList(numbers);
		// as we made original AL - synchronized, it can be safely used in Multithreaded context
		
		Set set = Collections.synchronizedSet(new HashSet<>());
		Map map = Collections.synchronizedMap(new HashMap<>());
		
		System.out.println(syncNumbers);
	}

}
