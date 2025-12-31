package com.prowings.collection.generics;

import java.util.ArrayList;

public class BoundsInGenerics {
	
	public static void main(String[] args) {
		
		BoxWithGenerics<Integer> b1 = new BoxWithGenerics<>();
		BoxWithGenerics<Object> b2 = new BoxWithGenerics<>();
		BoxWithGenerics<String> b3 = new BoxWithGenerics<>();
		
		BoxWithGenerics<? super Integer> b4 = new BoxWithGenerics<>();
 		
		Number n = 10;
		Integer o = 20;
		b4.setObject(o);
	}

}
