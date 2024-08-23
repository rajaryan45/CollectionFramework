package com.dsa.array;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;

public class RemoveDuplicate {
	 public int removeDuplicates(int[] nums) {
	        int s = 1 ;
	        for(int i = 1 ; i< nums.length ; i++) {
	        	if(nums[i] != nums[i-1]) {
	        		nums[s] = nums[i];
	        		s++;
	        	}
	        }
	        return s;
	    }
}
