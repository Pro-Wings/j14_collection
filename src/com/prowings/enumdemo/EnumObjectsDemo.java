package com.prowings.enumdemo;

enum Month
{
	
	JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);
	
	private int numberOfMonth;
	
	private Month() 
	{
		System.out.println("constructor invoked!!!");
	}

	private Month(int number) {
		System.out.println("param-constructor invoked!!!");
		this.numberOfMonth = number;
	}

	public int getNumberOfMonth() {
		return numberOfMonth;
	}
	
}

public class EnumObjectsDemo {
	
	public static void main(String[] args) {
		
		Month month = Month.APRIL;

		System.out.println(month);
		
		System.out.println(month.getNumberOfMonth());
		
		System.out.println("name of enum constant : "+month.name());
		System.out.println("ordinal : "+month.ordinal());
		//valueOf
		//toString
		
		System.out.println("------------------------------");

		String mnth = "MAY";
		
		Month m = Month.valueOf(Month.class, mnth);
		
		System.out.println(m);
		System.out.println(m.getNumberOfMonth());
		
		
	}

}
