package com.prowings.collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10, "Ram");
		Employee emp2 = new Employee(10, "Ram");
		Employee emp3 = new Employee(20, "Sham");
		Employee emp4 = emp3;
		
		System.out.println("Reference Equality : "+(emp1 == emp2));  //false -- reference equality
		
		System.out.println("Content Equality : "+(emp1.equals(emp2))); //true --content equality
		
		//identity hashmap always uses reference equality for finding duplicate keys!!
		IdentityHashMap<Employee, String> hm = new IdentityHashMap<>();

//		HashMap<Employee, String> hm = new HashMap<>();

		hm.put(emp1, "aaaa");
		hm.put(emp2, "bbbb");
		hm.put(emp3, "xxxx");
		hm.put(emp4, "yyyy");
		
		System.out.println(hm);
		
	}

}
