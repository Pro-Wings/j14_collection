package com.prowings.collection.map;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
		
		map.put("aaa", 123);
		map.put("bbb", 222);
		map.put("aaa", 333);
		map.put("ccc", 456);
//		map.put(null, 123);  // -- no null key allowed
//		map.put("ddd", null); //-- no null value allowed
		
		
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		
		Iterator<String> itr = keys.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			map.put("zzz", 1111);
		}

	}

}
