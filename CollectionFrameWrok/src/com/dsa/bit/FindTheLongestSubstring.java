package com.dsa.bit;

import java.util.HashMap;

public class FindTheLongestSubstring {
	public int findTheLongestSubstring(String s) {
		int xor = 0 , ans = 0 ; 
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		hMap.put(0, -1);
		for(int i = 0 ; i < s.length() ; i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				xor ^= ch;
			}
			if(hMap.containsKey(xor)) {
				ans = Math.max(ans, i - hMap.get(xor));
			}else hMap.put(xor, i);
		}
		return ans;
	}
}
