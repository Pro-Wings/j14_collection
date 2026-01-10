package com.prowings.enumdemo;

public class WithEnumDemo {
	
	public static void main(String[] args) {
		
		Size size = Size.SMALL;

		int sizeInNumber = getTShirtSizeInNumber(size);
		
		System.out.println("Entered size in Number is : "+sizeInNumber);
		
	}

	public static int getTShirtSizeInNumber(Size size) {
		
		int result = 0;
			
		switch(size)
		{
		
		case SMALL:
			result = 28;
			break;
		case MEDIUM:
			result = 32;
			break;
		case LARGE:
			result = 42;
			break;
		case EXTRALARGE:
			result = 44;
			break;
		default :
			System.out.println("Entered Size in not valid...");
			result = 0;
		}
		
		return result;
	}	

}
