package com.prowings.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapMethodsDemo {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.put("AAA", 11111));
		System.out.println(hm.put("BBB", 22222));
		System.out.println(hm.put("CCC", 33333));
		System.out.println(hm.put("DDD", 44444));
		
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.get("AAA"));
		
		System.out.println(hm.containsKey("VVV"));
		System.out.println(hm.containsValue(33333));
		
		System.out.println("Before remove() : "+hm);
		
		System.out.println(hm.remove("CCC"));
		
//		hm.clear();
		
		System.out.println("After remove() : "+hm);

		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		
		lhm.put("AAA", 12121);
		lhm.put("QQQ", 12121);
		lhm.put("RRR", 12121);
		
		System.out.println("Before putAll in LHM : "+lhm);
		
		lhm.putAll(hm);
		
		System.out.println("After putAll in LHM : "+lhm);
		
		
		System.out.println("----------------------");
		
		//keyset
		Set<String> keys = hm.keySet();
		
		Iterator<String> itr = keys.iterator();
		
		while(itr.hasNext())
		{
			if(itr.next().equals("BBB"))
			{
				itr.remove();
			}
		}
		
		keys.remove("AAA");
		
		System.out.println("Set of Keys after iterator's remove : "+keys);
		System.out.println("HM after iterator's remove on Set view : "+hm);
	}

}
