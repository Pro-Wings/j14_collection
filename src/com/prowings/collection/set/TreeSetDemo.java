package com.prowings.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<>();
		
		ts.add(300);
		ts.add(100); //int -> Integer
//		ts.add("AAA"); // this will result in ClassCastException -
		ts.add(300);
		ts.add(200);
		ts.add(500);
		ts.add(200);

		System.out.println(ts);
		
	}

}
