package com.prowings.interviewprograms;

import java.util.Comparator;

public class EmployeeSalaryComarator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		if(e1.getSalary() > e2.getSalary())
			return 3;
		else if(e1.getSalary() < e2.getSalary())
			return -3;
		else
			return 0;
			
		
	}

}
