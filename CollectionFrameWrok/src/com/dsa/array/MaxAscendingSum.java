package com.dsa.array;

public class MaxAscendingSum {
	
	public int maxAscendingSum(int[] nums) {
		int maxSub = nums[0] ;
		int cur =  nums[0];
		
		for(int i = 1; i<nums.length;i++ ) {
			if(nums[i]>=nums[i-1]) {
				cur += nums[i];
			}else {
				cur = nums[i];
			}
			maxSub = Math.max(cur, maxSub);
		}
		return maxSub;
	}

}
