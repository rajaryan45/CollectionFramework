package com.dsa.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CharacterReplacement {
	public int characterReplacement(String s, int k) { 
       int[] charFreq = new int[26];
       Arrays.fill(charFreq, 0);
       int maxCount = 0 ;
       int maxLen = 0;
       int i= 0  , j = 0 ;
       while(j < s.length()) {
    	   charFreq[s.charAt(j)-'A']++;
    	   maxCount = Math.max(maxCount, charFreq[s.charAt(j)-'A']);
    	   while((j-i+1) - maxCount > k) {
    		   charFreq[s.charAt(i)-'A']--;
    		   maxCount = 0;
    		   for(int l = 0 ; l < charFreq.length ; l++) {
    			   maxCount = Math.max(maxCount, charFreq[l]);
    		   }
    		   i++;
    	   }
    	   if((j-i+1) - maxCount <=k) {
    		   maxLen = Math.max(maxLen, (j-i+1));
    	   }
    	   j++;
       }
       
       return maxCount;
    }

}
