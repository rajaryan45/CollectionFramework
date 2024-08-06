package com.dsa.array;

public class MaximumSubArray {
	
	public int maxSubArray(int[] nums) {
		int maxSub = Integer.MIN_VALUE; 
		int cur = 0;
		for(int num: nums) {
			cur += num;
			maxSub = Math.max(maxSub, cur);
			if(cur < 0)
				cur = 0;
		}
		
		return maxSub;
				
    }
}
