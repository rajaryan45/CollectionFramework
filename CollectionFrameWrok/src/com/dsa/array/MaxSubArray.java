package com.dsa.array;

public class MaxSubArray {
	
	public int maxSubArray(int[] nums) {
		int maxSum = 0; 
		int curr= 0 ;
		for(int i:nums) {
			curr += i;
			maxSum = Math.max(maxSum, curr);
			if(curr < 0)
				curr = 0;
		}
		return maxSum;
	}

}
