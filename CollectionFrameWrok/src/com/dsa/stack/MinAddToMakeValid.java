package com.dsa.stack;

import java.util.Stack;

public class MinAddToMakeValid {
	 public int minAddToMakeValid(String s) {
		 int close = 0 , open = 0;
		 for(int i = 0; i<s.length(); i++) {
			 char ch = s.charAt(i);
			 if(ch == '(') {
				 open++;
			 }else {
				 if(open <= 0 ) {
					 close++;
				 }else {
					open--;
				}
			 }
		 }
		 return close+open;
	 }
	
	
//	 public int minAddToMakeValid(String s) {
//		 Stack<Character> stack = new Stack<Character>();
//		 for(int i = 0 ; i<s.length(); i++) {
//			 char ch = s.charAt(i);
//			 if(ch == '(') {
//				 stack.push(ch);
//			 }else if(stack.empty() || ch==')') {
//				 stack.push(ch);
//			 }else {
//				stack.pop();
//			}
//				 
//		 }
//		 return stack.size();
//	 }
}
