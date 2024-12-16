package com.dsa.slidingwindow;

import java.util.HashMap;

public class MaximumLengthSubstring {
	
	public int maximumLengthSubstring(String s) {
		
		int length = 0 ; 
		int i = 0 , j = 0 ;
		int mSum = 0;
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		while(j < s.length()) {
			char ch = s.charAt(j);
			hMap.put(ch, hMap.getOrDefault(ch, 0)+1);
			while(hMap.get(ch) > 2) {
				hMap.put(s.charAt(i), hMap.get(s.charAt(i))-1);
				i++;
			}
			mSum = Math.max(j-i + 1, mSum);
        	j++;
		}
		
		return mSum;
		
	}



}
