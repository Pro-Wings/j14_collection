package com.prowings.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAlgorithmMethodsDemo2 {
	
	public static void main(String[] args) {
		
		Student std1 = new Student(10, "Ram", 90);
		Student std2 = new Student(20, "Sham", 99);
		Student std3 = new Student(30, "Abhinav", 100);
		Student std4 = new Student(40, "Aarav", 87);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(std1);
		studentList.add(std2);
		studentList.add(std3);
		studentList.add(std4);
		
		System.out.println("Before sorting : "+studentList);
		
		//sort by name
//		Collections.sort(studentList);
//		Collections.sort(studentList, new StudentNameComparator());
		
		//sort by marks
		Collections.sort(studentList, new StudentMarksComparator());
		
		
		System.out.println("After sorting : "+studentList);
	}

}
