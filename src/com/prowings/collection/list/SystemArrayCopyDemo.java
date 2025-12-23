package com.prowings.collection.list;

import java.util.Arrays;

public class SystemArrayCopyDemo {
	
	public static void main(String[] args) {
		
		int[] A = {10,20,30};
		int[] B = {40,50,60,70,80,90};
		
		int[] concatinatedArray = concat(A, B);
		
		System.out.println(Arrays.toString(concatinatedArray));
		
	}

	public static int[] concat(int[] a, int[] b) {
		
		int[] result = new int[a.length + b.length];
		//copy elements from A
		System.arraycopy(a, 0, result, 0, a.length);

		//copy elements from B
		System.arraycopy(b, 0, result, a.length, b.length);
		
		return result;
		
	}

}
