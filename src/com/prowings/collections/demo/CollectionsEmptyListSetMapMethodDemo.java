package com.prowings.collections.demo;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionsEmptyListSetMapMethodDemo {
	
	public static void main(String[] args) {
		
		Collections.emptyList();
		Collections.emptySet();
		Collections.emptyMap();
		
		//singlton collection
		
		List<String> singltonList = Collections.singletonList("A");
		
		System.out.println(singltonList);

		singltonList.add("B");
		singltonList.add("C");
		
		System.out.println(singltonList);
	}

}
