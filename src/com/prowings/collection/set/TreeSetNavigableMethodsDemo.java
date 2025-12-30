package com.prowings.collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetNavigableMethodsDemo {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<>();
		
		ts.add(300);
		ts.add(700);
		ts.add(100);
		ts.add(200);
		ts.add(500);
		ts.add(600);
		ts.add(400);

		System.out.println(ts);
		
		//higher -- GT
		System.out.println("higher(600) : "+ts.higher(600));

		//lower -- LT
		System.out.println("lower(500) : "+ts.lower(500));

		//ceiling -- GT-EQ
		System.out.println("ceiling(600) : "+ts.ceiling(600));

		//floor -- LT-EQ
		System.out.println("floor(500) : "+ts.floor(500));
		
		
		//descendingSet
		System.out.println(ts.descendingSet());
		
		//pollFirst
		System.out.println(ts.pollFirst());
		
		System.out.println("TS After pollfirst : "+ts);

		//pollLast
		System.out.println(ts.pollLast());
		
		System.out.println("TS After pollLast : "+ts);
		
		System.out.println("------ITERATOR----------");
		
		Iterator itr = ts.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
