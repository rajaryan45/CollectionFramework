package com.dsa.bit;

public class LongestSubarray {
	
	public int longestSubarray(int[] nums) {
		
		if(nums.length == 1)
			return nums[0];
		int count = 0 , ans = 0 , max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i<nums.length; i++) {
			if(nums[i] == max) {
				count++;
			}else if(nums[i] > max) {
				max = nums[i];
				count = 1;
			}else {
				count = 0;
			}
			ans = Math.max(count, ans);
		}
		return ans;
		
		
	}
	

}
