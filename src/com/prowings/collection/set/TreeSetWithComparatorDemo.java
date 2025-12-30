package com.prowings.collection.set;

import java.util.TreeSet;

public class TreeSetWithComparatorDemo {
	
	public static void main(String[] args) {
		
		Car c3 = new Car(30, "Suzuki", 200000);
		Car c1 = new Car(10, "Audi", 700000);
		Car c2 = new Car(20, "Ferrari", 1000000);
		
		CarPriceComparator prizeComparator = new CarPriceComparator();
		CarCompanyNameComparator comanyNameComparator = new CarCompanyNameComparator();
		CarIdComparator carIdComparator = new CarIdComparator();
		
		TreeSet ts = new TreeSet<>(carIdComparator);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		
		System.out.println(ts);
	}
	

}
