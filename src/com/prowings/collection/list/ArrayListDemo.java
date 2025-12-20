package com.prowings.collection.list;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemo {
	
    static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		ArrayList al = new ArrayList();
		int x = 123;
		al.add(x);
		al.add("hello");
		al.add("hii");
		al.add("hii");
		al.add("hello");
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		
		
		System.out.println(al.size());
		
		System.out.println(al);
		
		System.out.println("main method ended!!");
		
	}

}
