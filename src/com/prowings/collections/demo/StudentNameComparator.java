package com.prowings.collections.demo;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student std1, Student std2) {
		
		return std1.getName().compareTo(std2.getName());
		
	}

}
