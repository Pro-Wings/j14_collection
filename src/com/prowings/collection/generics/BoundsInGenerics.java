package com.prowings.collection.generics;

import java.util.ArrayList;
import java.util.HashSet;

public class BoundsInGenerics {
	
	public static void main(String[] args) {
		
		BoxWithGenerics<Integer> b1 = new BoxWithGenerics<>();
		BoxWithGenerics<Object> b2 = new BoxWithGenerics<>();
		BoxWithGenerics<String> b3 = new BoxWithGenerics<>();
		
		BoxWithGenerics<? super Integer> b4 = new BoxWithGenerics<>();
 		
		Number n = 10;
		Integer o = 20;
		b4.setObject(o);
		
		HashSet<String> set2 = new HashSet<>();
		set2.add("aaa");
		set2.add("bbb");
		
		
		HashSet<Integer> set = new HashSet<>();
		set.add(123);
		set.add(345);
		set.add(567);
		
		
		ArrayList<Number> list = new ArrayList<>();

		list.addAll(set);
		
	}

}
