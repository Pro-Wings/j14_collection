package com.prowings.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SynchronizedHashMapDemo {
	
	public static void main(String[] args) {
		
		Map<String, Integer> syncMap = Collections.synchronizedMap(new HashMap<>());
		
		syncMap.put("aaa",123);
		syncMap.put("bbb",null);
		syncMap.put("ccc",null);
		syncMap.put(null,123);
		
		System.out.println(syncMap);
		
		Set<String> keys = syncMap.keySet();
		
		Iterator<String> itr = keys.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			syncMap.put("zzz", 1111);
		}
		
		
		
	}

}
