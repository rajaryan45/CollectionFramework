package com.dsa.array;

public class LongestMonotonicSubarray {
	public int longestMonotonicSubarray(int[] nums) {
		int maxCount = 1 ;
		int inCount = 1 , decCount = 1;
		for(int i = 0 ; i<nums.length-1; i++) {
			if(nums[i]>nums[i+1]) {
				inCount++;
				decCount = 1;
			}else if(nums[i] < nums[i+1]) {
				decCount++;
				inCount = 1;
			}else {
				inCount = 1;
				decCount =1;
			}
			maxCount = Math.max(maxCount, Math.max(inCount, decCount));
			
		}
		return maxCount;
	}
}
