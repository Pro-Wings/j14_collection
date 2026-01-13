package com.prowings.collections.demo;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student std1, Student std2) {
		
		if(std1.getMarks() > std2.getMarks())
			return 3;
		else if(std1.getMarks() < std2.getMarks())
			return -3;
		else
			return 0;
			
			
	}
	
	

}
