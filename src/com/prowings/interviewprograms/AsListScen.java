package com.prowings.interviewprograms;

import java.util.Arrays;
import java.util.List;

public class AsListScen {
	
	public static void main(String[] args) {
		
		List list = Arrays.asList(1,2,3);
		System.out.println(list);
		list.add(4);
		System.out.println(list);
	}

}
