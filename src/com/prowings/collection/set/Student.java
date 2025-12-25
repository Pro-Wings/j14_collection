package com.prowings.collection.set;

public class Student {
	
	int roll;
	String name;
	
	public Student() 
	{
	
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
	public boolean equals(Object o)
	{
		Student s = (Student)o;
		if((this.roll == s.roll) && (this.name.equals(s.name)))
				return true;
			else
				return false;
	}

	
	public int hashCode()
	{
		int result = 1;
		result = 31*roll + 31*this.name.hashCode();
		
		return result;
	}
}
