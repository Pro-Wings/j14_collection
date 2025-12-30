package com.prowings.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetMethodsDemo {
	
	public static void main(String[] args) {
		
//		IntegerDescendingComparator descendingComparator = new IntegerDescendingComparator();
//		TreeSet ts = new TreeSet<>(descendingComparator);

		TreeSet ts = new TreeSet<>();
		
		ts.add(300);
		ts.add(700);
		ts.add(100);
		ts.add(200);
		ts.add(500);
		ts.add(600);
		ts.add(400);

		System.out.println(ts);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		//headset - headSet(E toElement) - here toElement is exlusive
		System.out.println("HeadSet(400) : "+ts.headSet(400));

		//tailset - tailSet(E fromElement) - here fromElement is inclusive
		System.out.println("TailSet(400) : "+ts.tailSet(400));

		//subset - subSet(E fromElement, E toElement) - here fromElement is inclusive and toElement is exlusive
		System.out.println("SubSet(200,600) : "+ts.subSet(200, 600));
		
		Comparator cmp = ts.comparator();
		
		
		
		System.out.println(cmp);
		
	}

}
