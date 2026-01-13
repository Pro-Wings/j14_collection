package com.prowings.interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondHighestElement {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10, "Ram", 80000);
		Employee emp2 = new Employee(20, "Arun", 67000);
		Employee emp3 = new Employee(30, "Sachin", 58000);
		Employee emp4 = new Employee(40, "Sam", 8000);
		Employee emp5 = new Employee(50, "Siddhesh", 45000);
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		System.out.println("All Emp List : "+empList);
		Employee secondHighSalaryEmp = findSecondHighestSalariedEmp(empList);
		System.out.println("Second Highest employee : "+secondHighSalaryEmp);
	}

	public static Employee findSecondHighestSalariedEmp(List<Employee> empList) {

		Collections.sort(empList, new EmployeeSalaryComarator());
		System.out.println("Sorted empList : "+empList);
		
		return empList.get(empList.size()-2);
	}
}
