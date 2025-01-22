package com.dsa.stack;

import java.util.Stack;

/*
 *   Problem link : https://leetcode.com/problems/valid-parentheses/
 */
public class IsValid {
	public boolean isValid(String s) {
        Stack<Character>stack = new Stack<Character>();
        for(int i = 0 ; i<s.length(); i++) {
        	char ch = s.charAt(i);
        	if(ch == '(' || ch == '{' || ch == '[') {
        		stack.push(ch);
        	}else {
        		if(stack.isEmpty())return false;
				char peekEle = stack.peek();
				if(ch == ')' && peekEle !='(') {
					return false;
				}else if(ch == ']' && peekEle !='[') {
					return false;
				}else if(ch == '}' && peekEle !='{') {
					return false;
				}else {
					stack.pop();
				}
			}
        }
        return stack.isEmpty();
   }
}
