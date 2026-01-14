package com.prowings.collection.map;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
//		Hashtable<String, Integer> ht = new Hashtable<>();
//		ht.put("aaaa", 123);

		Car c1 = new Car(10, "Audi");
		Car c2 = new Car(20, "BMW");
		Car c3 = new Car(10, "Audi");
		
		
		Hashtable<Car, Integer> ht = new Hashtable<>();
		
		ht.put(c1, 1111111);
		ht.put(c2, 2222222);
		ht.put(c3, 3333333);
		
		System.out.println(ht);
		
		
		
	}

}
