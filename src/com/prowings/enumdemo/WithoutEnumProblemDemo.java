package com.prowings.enumdemo;

public class WithoutEnumProblemDemo {
	
	public static void main(String[] args) {
		
		String size = null;

		int sizeInNumber = getTShirtSizeInNumber(size);
		
		System.out.println("Entered size in Number is : "+sizeInNumber);
		
	}

	public static int getTShirtSizeInNumber(String size) {
		
		int result = 0;
		
		if(size == null || size.isBlank())
		{
			System.out.println("Entered size is either null or blank...");
			return 0;
		}
		
		switch(size.toUpperCase())
		{
		
		case "SMALL":
			result = 28;
			break;
		case "MEDIUM":
			result = 32;
			break;
		case "LARGE":
			result = 42;
			break;
		case "EXTRALARGE":
			result = 44;
			break;
		default :
			System.out.println("Entered Size in not valid...");
			result = 0;
		}
		
		return result;
	}	

}
