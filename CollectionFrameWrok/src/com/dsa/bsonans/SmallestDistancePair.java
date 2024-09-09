package com.dsa.bsonans;

import java.util.Arrays;

public class SmallestDistancePair {
	private boolean isPossible(int[] nums, int k , int mid) {
		
		int total = 0;
		int i = 0 , j = 1 ;
		while(j < nums.length) {
			while(nums[j] - nums[i] > mid) {
				i++;
			}
			total += (j-i);
			j++;
		
		}
		if(total < k)
			return true;
		
		return false;
	}
	
	public int smallestDistancePair(int[] nums, int k) {
		
		Arrays.sort(nums);
		int n = nums.length;
		int s = 0 , e = nums[n-1]- nums[0];
		int res = 0 ;
		
		while(s<=e) {
			int mid = (e-s)/2 + s;
			if(isPossible(nums,k,mid)) {
				s = mid + 1;
			}else {
				res = mid;
				e = mid -1;
			}
		}
		
		return  res;
	        
	}
}
