package com.prowings.collection.set;

import java.util.TreeSet;

public class TreeSetWithCustomClass {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10, "Balaji", 80000);
		Employee emp2 = new Employee(20, "Sham", 70000);
		Employee emp3 = new Employee(30, "Amit111", 60000);
		Employee emp4 = new Employee(30, "Amit222", 60000);
		
		TreeSet ts = new TreeSet<>();
		
		
//		ts.add(null); //this will result into NPE - no null allowed in Tree DS
		ts.add(emp2);
		ts.add(emp4);
		ts.add(emp1);
		ts.add(emp3);
		
		System.out.println(ts);
	}

}
