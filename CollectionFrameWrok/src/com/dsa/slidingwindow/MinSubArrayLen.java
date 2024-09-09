package com.dsa.slidingwindow;

public class MinSubArrayLen {
	 public int minSubArrayLen(int target, int[] nums) {
		 int i = 0 , j = 0 ; 
		 int curSum = 0;
		 int minLen = nums.length + 1;
		 int curLen =0 ;
		 while(j<nums.length) {
			 curSum += nums[j];
			 while(curSum >= target) {
				 curLen = j - i + 1;
				 minLen = Math.min(curLen, minLen);
				 curSum -= nums[i];
				 i++;
			 }
				j++;
			
		 }
		 return minLen != nums.length ? minLen:0 ;
	 }
}
