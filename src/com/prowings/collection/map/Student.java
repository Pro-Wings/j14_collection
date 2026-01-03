package com.prowings.collection.map;

import java.util.Objects;

public class Student {
	
	private int rollNumber;
	private String name;
	private float marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNumber, String name, float marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Float.floatToIntBits(marks) == Float.floatToIntBits(other.marks) && Objects.equals(name, other.name)
				&& rollNumber == other.rollNumber;
	}
	
	
	

}
