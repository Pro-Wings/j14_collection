package com.prowings.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingOverHashMap {
	
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.println(hm.put("AAA", 11111));
		System.out.println(hm.put("BBB", 22222));
		System.out.println(hm.put("CCC", 33333));
		System.out.println(hm.put("DDD", 44444));

		System.out.println("--------- Iterator on KeySet ----------");
		
		Set<String> keySet = hm.keySet();
		Iterator<String> itr = keySet.iterator();
		
		while(itr.hasNext())
		{
			String key = itr.next();
			Integer value = hm.get(key);
			
			System.out.println("Key : "+key +"  " + "Value : "+value);
		}
		
		System.out.println("--------- Enhanced for on KeySet ----------");
		
		for(String key : keySet)
		{
			System.out.println("Key : "+key +"  "+ "Value : "+hm.get(key));
		}
		
		System.out.println("--------- Iterator on EntrySet ----------");
		
		Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
		
		Iterator<Map.Entry<String, Integer>> itr2 = entrySet.iterator();
		
		while(itr2.hasNext())
		{
			Entry<String, Integer> entry = itr2.next();
			
			System.out.println("Key : "+entry.getKey() +"  "+ "Value : "+entry.getValue());
		}
		
		System.out.println("--------- Enhanced for on EntrySet ----------");
		
		for(Map.Entry<String, Integer> entry : entrySet)
		{
			System.out.println("Key : "+entry.getKey() +"  "+ "Value : "+entry.getValue());
		}
		
	}

}
