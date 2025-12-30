package com.prowings.collection.set;

import java.util.Comparator;

public class CarIdComparator implements Comparator{

	@Override
	public int compare(Object car1, Object car2) {
		
		//step1 - downcast both incoming objects 
		Car firstCar = (Car)car1;
		Car secondCar = (Car)car2;

//		if(firstCar.getCarId() > secondCar.getCarId())
//			return -9;
//		else if(firstCar.getCarId() < secondCar.getCarId())
//			return 4;
//		else
//			return 0;
		
		Integer firstCarId = firstCar.getCarId();
		Integer secondCarId = secondCar.getCarId();
		
		return firstCarId.compareTo(secondCarId);
		
	}
	
	

}
