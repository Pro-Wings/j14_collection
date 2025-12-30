package com.prowings.collection.set;

import java.util.Comparator;

public class CarPriceComparator implements Comparator{

	@Override
	public int compare(Object car1, Object car2) {
		
		//step1 - downcast both incoming objects 
		Car firstCar = (Car)car1;
		Car secondCar = (Car)car2;
		
		if(firstCar.getPrice() > secondCar.getPrice())
			return 4;
		else if(firstCar.getPrice() < secondCar.getPrice())
			return -3;
		else
			return 0;
		
		
	}
	

}
