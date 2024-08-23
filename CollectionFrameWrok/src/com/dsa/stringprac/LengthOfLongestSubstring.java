package com.dsa.stringprac;

import java.util.HashMap;

public class LengthOfLongestSubstring {
	public int lengthOfLongestSubstring(String s) {
        int res = 0 ; 
        int i = 0 , j = 0 ; 
        int cSum = 0 , mSum = 0 ; 
        HashMap<Character, Integer>hMap = new HashMap<Character, Integer>();
        
        while(j<s.length()) {
        	if(hMap.containsKey(s.charAt(j)) && hMap.get(s.charAt(j))>= i) {
        		if(i<= hMap.get(s.charAt(j))) {
        			
        			i = hMap.get(s.charAt(j)) + 1;
        			hMap.replace(s.charAt(j), j);
        			
        		}
        	}else {
            	hMap.put(s.charAt(j), j);
                    // Slide the window by removing the leftmost element                    i++;
        	}
        	cSum = (j - i) + 1;
        	mSum = Math.max(mSum, cSum);
            j++;
        }
        
        
        return mSum; 
        
    }
}
