package com.prowings.interviewprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByValue {
	
	public static void main(String[] args) {
		
		Map<String, Integer> hm = new HashMap<>();
		
		hm.put("aaa", 222);
		hm.put("bbb", 333);
		hm.put("ccc", 111);
		hm.put("ddd", 444);
		
		System.out.println(hm);
		
		//sort using keys
		TreeMap<String, Integer> tm = new TreeMap<>(hm);
		System.out.println(tm);

		//sort by values
		Collection<Integer> values = hm.values();
		
		List<Map.Entry<String, Integer>> entriesList = new ArrayList<>();
		
		for(Map.Entry<String, Integer> e : hm.entrySet())
		{
			entriesList.add(e);
		}
		
		System.out.println(entriesList);
		Collections.sort(entriesList, new EntryComparator());
		System.out.println("sorted entries : "+entriesList);
		
		Map<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		
		for(Map.Entry<String, Integer> e : entriesList)
		{
			lhm.put(e.getKey(), e.getValue());
		}
		
		System.out.println("Sorted HM by Values : "+lhm);
	}

}
