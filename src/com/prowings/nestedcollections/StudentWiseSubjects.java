package com.prowings.nestedcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentWiseSubjects {

	public static void main(String[] args) {

		List<String> group1Subs = Arrays.asList("Maths", "Physics", "Chemistry");
		List<String> group2Subs = Arrays.asList("Biology", "Physics", "Chemistry");
		List<String> group3Subs = Arrays.asList("Biology", "Maths", "Physics", "Chemistry");

		Map<String, List<String>> studentSubjectsList = new HashMap<>();

		studentSubjectsList.put("Ram", group3Subs);
		studentSubjectsList.put("Sachin", group1Subs);
		studentSubjectsList.put("Sham", group1Subs);
		studentSubjectsList.put("Nitin", group2Subs);
		studentSubjectsList.put("Lakhan", group3Subs);
		studentSubjectsList.put("Bob", group2Subs);

		Set<Map.Entry<String, List<String>>> entries = studentSubjectsList.entrySet();

		for (Map.Entry<String, List<String>> e : entries) {
			System.out.println("Student :" + e.getKey() + "  " + "Subjects : " + e.getValue());
		}
		
		System.out.println("--------------------------------------");
		String input = "biology";
		
		System.out.println(getStudentsBySubject(input,studentSubjectsList));
	}

	public static List<String> getStudentsBySubject(String subject, Map<String, List<String>> studentSubjectsList) {
		List<String> studentsList = new ArrayList<>();

		Set<Map.Entry<String, List<String>>> entries = studentSubjectsList.entrySet();

		for (Map.Entry<String, List<String>> e : entries) {
			if (e.getValue().contains(subject))
				studentsList.add(e.getKey());
		}

		return studentsList;

	}

}
