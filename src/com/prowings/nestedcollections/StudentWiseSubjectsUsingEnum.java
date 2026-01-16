package com.prowings.nestedcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

enum Subjects
{
	MATHS, BIOLOGY, PHYSICS, CHEMISTRY;
}

public class StudentWiseSubjectsUsingEnum {

	public static void main(String[] args) {

		List<Subjects> group1Subs = Arrays.asList(Subjects.MATHS, Subjects.PHYSICS, Subjects.CHEMISTRY);
		List<Subjects> group2Subs = Arrays.asList(Subjects.BIOLOGY,Subjects.PHYSICS, Subjects.CHEMISTRY);
		List<Subjects> group3Subs = Arrays.asList(Subjects.BIOLOGY, Subjects.MATHS, Subjects.PHYSICS, Subjects.CHEMISTRY);

		Map<String, List<Subjects>> studentSubjectsList = new HashMap<>();

		studentSubjectsList.put("Ram", group3Subs);
		studentSubjectsList.put("Sachin", group1Subs);
		studentSubjectsList.put("Sham", group1Subs);
		studentSubjectsList.put("Nitin", group2Subs);
		studentSubjectsList.put("Lakhan", group3Subs);
		studentSubjectsList.put("Bob", group2Subs);

		Set<Map.Entry<String, List<Subjects>>> entries = studentSubjectsList.entrySet();

		for (Map.Entry<String, List<Subjects>> e : entries) {
			System.out.println("Student :" + e.getKey() + "  " + "Subjects : " + e.getValue());
		}
		
		System.out.println("--------------------------------------");
		Subjects input = Subjects.MATHS;
		
		System.out.println(getStudentsBySubject(input,studentSubjectsList));
	}

	public static List<String> getStudentsBySubject(Subjects subject, Map<String, List<Subjects>> studentSubjectsList) {
		List<String> studentsList = new ArrayList<>();

		Set<Map.Entry<String, List<Subjects>>> entries = studentSubjectsList.entrySet();

		for (Map.Entry<String, List<Subjects>> e : entries) {
			if (e.getValue().contains(subject))
				studentsList.add(e.getKey());
		}

		return studentsList;

	}

}
