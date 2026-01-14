package com.prowings.collection.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo2 {
	
	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		
		ht.put("aaaa", 123);
		ht.put("bbbb", 123);
		ht.put("cccc", 123);
		ht.put("dddd", 345);

		System.out.println(ht);
		
		Set<String> keySet = ht.keySet();
		
		Iterator<String> itr = keySet.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			ht.remove("cccc");
		}

		
		Enumeration<String> enumeration = ht.keys();
//		Enumeration<Integer> enumeration = ht.elements();
		
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
			ht.remove("cccc");
		}
		
	}

}
