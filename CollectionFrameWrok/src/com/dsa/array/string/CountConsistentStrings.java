package com.dsa.array.string;

import java.util.HashSet;

public class CountConsistentStrings {
	
	public int countConsistentStrings(String allowed, String[] words) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0 ; i<allowed.length() ; i++) {
			set.add(allowed.charAt(i));
		}
		int count = words.length;
		for(String word : words) {
			for(int i = 0 ; i<word.length() ; i++) {
				if(!set.contains(word.charAt(i))) {
					count--;
					break;
				}
			}
		}
		return count;
	}
}
