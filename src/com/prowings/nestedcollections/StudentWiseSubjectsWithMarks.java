package com.prowings.nestedcollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//enum Subjects {
//	MATHS, BIOLOGY, PHYSICS, CHEMISTRY;
//}

public class StudentWiseSubjectsWithMarks {

	public static void main(String[] args) {

		Map<Subjects, Float> subjectsWithMarks1 = new HashMap<>();
		subjectsWithMarks1.put(Subjects.MATHS, 98.0f);
		subjectsWithMarks1.put(Subjects.BIOLOGY, 92.5f);
		subjectsWithMarks1.put(Subjects.PHYSICS, 86.2f);
		subjectsWithMarks1.put(Subjects.CHEMISTRY, 87.8f);

		Map<String, Map<Subjects, Float>> studentsSubjectsWithMarks = new HashMap<>();

		studentsSubjectsWithMarks.put("Ram", subjectsWithMarks1);

		Map<Subjects, Float> subjectsWithMarks2 = new HashMap<>();
		subjectsWithMarks2.put(Subjects.BIOLOGY, 67.5f);
		subjectsWithMarks2.put(Subjects.PHYSICS, 69.2f);
		subjectsWithMarks2.put(Subjects.CHEMISTRY, 87.8f);

		studentsSubjectsWithMarks.put("Sham", subjectsWithMarks2);

		Map<Subjects, Float> subjectsWithMarks3 = new HashMap<>();
		subjectsWithMarks3.put(Subjects.MATHS, 78.0f);
		subjectsWithMarks3.put(Subjects.PHYSICS, 69.2f);
		subjectsWithMarks3.put(Subjects.CHEMISTRY, 76.8f);

		studentsSubjectsWithMarks.put("Sachin", subjectsWithMarks3);

		// Average marks of every students in all subjects

		System.out.println("----------------------------------------------");
		Map<String, Float> avgMarks = calculateAvgMarks(studentsSubjectsWithMarks);

		System.out.println("Student wise avg marks : " + avgMarks);

		// Topper for every subject
		Map<Subjects, String> subjectWiseTopper = findSubjectWiseTopper(studentsSubjectsWithMarks);
		System.out.println("Topper for every subject : " + subjectWiseTopper);

	}

	public static Map<Subjects, String> findSubjectWiseTopper(
			Map<String, Map<Subjects, Float>> studentsSubjectsWithMarks) {

		// Stores topper name per subject
		Map<Subjects, String> subjectWiseTopper = new HashMap<>();

		// Stores highest marks per subject
		Map<Subjects, Float> subjectWiseMaxMarks = new HashMap<>();

		Set<Map.Entry<String, Map<Subjects, Float>>> entries = studentsSubjectsWithMarks.entrySet();

		for (Map.Entry<String, Map<Subjects, Float>> studentEntry : entries) {
			String studentName = studentEntry.getKey();
			Map<Subjects, Float> subjectMarksMap = studentEntry.getValue();

			// Iterate over subs of each student

			for (Map.Entry<Subjects, Float> subjectEntry : subjectMarksMap.entrySet()) {
				Subjects subject = subjectEntry.getKey();
				Float marks = subjectEntry.getValue();

				// If subject not seen before OR higher marks found

				if (!subjectWiseMaxMarks.containsKey(subject) || marks > subjectWiseMaxMarks.get(subject)) {
					subjectWiseMaxMarks.put(subject, marks);
					subjectWiseTopper.put(subject, studentName);
				}
			}
		}
		return subjectWiseTopper;
	}

	public static Map<String, Float> calculateAvgMarks(Map<String, Map<Subjects, Float>> studentsSubjectsWithMarks) {

		Map<String, Float> studentWiseAvgMarks = new HashMap<>();

		Set<Map.Entry<String, Map<Subjects, Float>>> entries = studentsSubjectsWithMarks.entrySet();

		for (Map.Entry<String, Map<Subjects, Float>> e : entries) {
			System.out.println("Student Name : " + e.getKey());
			System.out.println("Subjects with Marks : " + e.getValue());
			Collection<Float> allMarks = e.getValue().values();
			float avg = 0.0f;
			float totalMarks = 0.0f;
			for (Float f : allMarks) {
				totalMarks += f;
			}
			avg = totalMarks / allMarks.size();

			studentWiseAvgMarks.put(e.getKey(), avg);
		}
		return studentWiseAvgMarks;
	}

}
