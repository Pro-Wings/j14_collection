package com.prowings.collection.generics;

public class TestBoxWithGenrics {
	
	public static void main(String[] args) {
		
		BoxWithGenerics<String> box = new BoxWithGenerics<>();
		
//		box.setObject(1234);
		
		System.out.println(box.getObject());
		
	}

}
