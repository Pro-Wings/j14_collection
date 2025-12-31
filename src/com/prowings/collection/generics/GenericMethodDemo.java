package com.prowings.collection.generics;

public class GenericMethodDemo {
	
	public static <T> void doSomething(T s)
	{
			System.out.println(s);
	}
//	public static void doSomething(Object s)
//	{
//		if(s instanceof String)
//		{
//			String s1 = (String)s;
//			s1 =s1.trim();
//			System.out.println(s1);
//		}
//		else
//			System.out.println(s);
//	}

	
	public static void main(String[] args) {
		
		doSomething("  hii  ");
		doSomething(1234);
		
	}
	
}
