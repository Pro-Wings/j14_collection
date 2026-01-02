package com.prowings.collection.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethodsDemo2 {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.println(hm.put("AAA", 11111));
		System.out.println(hm.put("BBB", 22222));
		System.out.println(hm.put("CCC", 33333));
		System.out.println(hm.put("DDD", 44444));

		
		Set<Map.Entry<String, Integer>> entries = hm.entrySet();
		
		Iterator<Map.Entry<String, Integer>> itr = entries.iterator();
		
		while(itr.hasNext())
		{
			Entry<String, Integer> e =  itr.next();
			System.out.println("Key : "+e.getKey() +"    "+ " Value : "+e.getValue());
		}
		
		
		System.out.println("----------------------------");
		
		
		Collection<Integer> values = hm.values();
		
		ArrayList<Integer> listOfValues = new ArrayList<>(values);
		
		System.out.println(values);
	}

}
