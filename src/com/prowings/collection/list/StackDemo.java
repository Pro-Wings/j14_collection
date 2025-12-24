package com.prowings.collection.list;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack stk = new Stack<>();
		System.out.println(stk.empty());
		
		stk.push(123);
		stk.push(123);
		stk.push(null);
		stk.push("aaa");
		stk.push("bbb");
		stk.push("ccc");
		stk.push(345);
		
		System.out.println(stk);
		
//		System.out.println(stk.pop());
		System.out.println(stk.peek());
		
		
		System.out.println("after pop : "+stk);
		
		System.out.println(stk.empty());
		
		System.out.println(stk.search(12334));
		
	}

}
