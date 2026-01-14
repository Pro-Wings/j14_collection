package com.prowings.collection.map;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		map.put("asd", 1344);
		map.put("bbb", null);
		map.put("ccc", null);
		map.put("ddd", null);
		
		System.out.println(map);
		
	}

}
