package com.prowings.collection.set;

public class Employee implements Comparable {
	
	private int empId;
	private String name;
	private int salary;

	public Employee() {
		super();
	}

	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object anotherEmp) {
		
		/*
		 * if Greater Than --- then return any positive int value
		 * if Less Than ---    then return any negative int value
		 * if Equals Then ---  then return zero (0) value
		 */
		//step1 - downcast incoming employee into Employee
		Employee incomingEmp = (Employee)anotherEmp;
		
		//1 -- Comparision by EmpId
		
		if(this.empId > incomingEmp.empId)
			return 1;
		else if(this.empId < incomingEmp.empId)
			return -1;
		else
			return 0;
		
		//2 -- Comparision by Salary
//		if(this.salary > incomingEmp.salary)
//			return 2;
//		else if(this.salary < incomingEmp.salary)
//			return -4;
//		else
//			return 0;
		
		//3 -- Comparision by Name
//		return this.name.compareTo(incomingEmp.name);
		
	}
	
	
	

}
