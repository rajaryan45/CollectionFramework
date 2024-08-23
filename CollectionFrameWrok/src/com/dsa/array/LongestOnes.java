package com.dsa.array;

public class LongestOnes {
	public int longestOnes(int[] nums, int k) {
        int mSum = 0 ; 
        int i = 0 , j = 0 ;
        int count = 0 ;
        while(j<nums.length ) {
        	if(nums[j] == 0 )
        	{
        		count++;
        	}
        	while(count > k ) {
        		if(nums[i] ==0 ) count--;
        		i++;
        	}
        	mSum = Math.max(j-i + 1, mSum);
        	j++;
        	
        }
		return mSum  ;
    }
}
