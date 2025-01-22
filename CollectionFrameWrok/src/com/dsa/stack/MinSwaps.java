package com.dsa.stack;

import java.util.Iterator;
import java.util.Stack;

public class MinSwaps {
	/*
	 * in first method will do the brute force method where we will 
	 * use Stack data structure to solve the problem
	 */
	public int minSwaps(String s) {
		int close = 0;
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0 ; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '[') {
				stack.push(ch);
			}else {
				if(stack.empty() || stack.peek() == ']') {
					stack.push(ch);
					close++; // here we are counting the number of close 
							// brackets that are unbalanced
				}else {
					stack.pop();
			
				}
			}
		}
		return Math.ceilDiv(close, 2); // this is result you can dry run you will also find this.
	}
	
	/*
	 *  Now We have to optimise this code how we can do this 
	 */
	
	// remember I have chnaged the name of method as its have same signature with the above one
	public int minSwaps1(String s) {
		int close = 0 , open =0 ;
		
		for(int i = 0 ; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '[') {
				open++;
			}else {
				if(open <=0) {
					close++; // here we are counting the number of close 
							// brackets that are unbalanced
				}else {
					open--;
			
				}
			}
		}
		return Math.ceilDiv(close, 2); // this is result you can dry run you will also find this.
	}

}
