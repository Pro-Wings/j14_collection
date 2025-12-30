package com.prowings.collection.set;

import java.util.Comparator;

public class CarCompanyNameComparator implements Comparator{

	@Override
	public int compare(Object car1, Object car2) {
		
		//step1 - downcast both incoming objects 
		Car firstCar = (Car)car1;
		Car secondCar = (Car)car2;

		return firstCar.getComapny().compareTo(secondCar.getComapny());
	}
	
	

}
