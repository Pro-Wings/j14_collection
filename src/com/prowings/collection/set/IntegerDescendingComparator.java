package com.prowings.collection.set;

import java.util.Comparator;

public class IntegerDescendingComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer n1, Integer n2) {
		
		if(n1 > n2)
			return -7;
		else if(n1 < n2)
			return 5;
		else
			return 0;
	}

}
