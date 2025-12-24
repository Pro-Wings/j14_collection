package com.prowings.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {
	
	public static void main(String[] args) {
		
		Vector v1 = new Vector(); //no-arg constructor
		
		v1.add(123);
		v1.add("aaa");
		v1.add(345);
		v1.add(345);
		
		System.out.println(v1);

		Enumeration enm = v1.elements();
		int x = 10;
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
			if(x == 10)
			{
				v1.removeElementAt(0);
			}
			x++;
		}
		
		System.out.println(v1);
		
		System.out.println("--------------------------");
		
		Iterator itr = v1.iterator();
		int y = 10;
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			if(y == 10)
			{
				v1.removeElementAt(0);
			}
			y++;
		}
	}

}
