package com.prowings.collection.map;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("aaa");
		
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			list.add("MMM");
		}
		
		System.out.println(list);
		
	}

}
