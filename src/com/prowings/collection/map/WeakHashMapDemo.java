package com.prowings.collection.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	
	public static void main(String[] args) {
		
		WeakHashMap<StringBuffer, Integer> hm = new WeakHashMap<>();
//		HashMap<StringBuffer, Integer> hm = new HashMap<>();
		
		StringBuffer k1 = new StringBuffer("AAA");
		StringBuffer k2 = new StringBuffer("BBB");
		StringBuffer k3 = new StringBuffer("CCC");
		StringBuffer k4 = new StringBuffer("DDD");
		
		hm.put(k1, 123);
		hm.put(k2, 123);
		hm.put(k3, 123);
		hm.put(k4, 123);
		
		System.out.println("Before GC : "+hm);
		
		k2 = null; //k2-->"BBB" now we dereferenced it
		
		//call GC - NOTE: calling Garbage Collection externally is not guaranteed!!
		System.gc();
		
		System.out.println("After GC : "+hm);
	}

}
