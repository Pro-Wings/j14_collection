package com.prowings.collection.list;

import java.util.ArrayList;

public class ArrayListOwnMethodsDemo2 extends ArrayList{

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(123);
		al.add("hii");
		al.add(345);
		al.add("hello");
		al.add(789);
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("abc");
		al.add("abc");

//		al.removeRange(3,6); //We can not use this method directly, this is a method that is meant for framework's internal uses, not for end users.
		

	}

}
