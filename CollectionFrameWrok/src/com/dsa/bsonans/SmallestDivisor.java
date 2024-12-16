package com.dsa.bsonans;

public class SmallestDivisor {
	
	public int smallestDivisor(int[] nums, int threshold) {
		int res = 0 ;
		int mx = 0;
		for(int i = 0 ; i<nums.length; i++) {
			if(nums[i] > mx)
				mx = nums[i];
		}
		int s = 1 , e = mx;
		while(s<=e) {
			int mid = s + ((e-s)/2);
			if(isDivisorPossible(nums,threshold,mid)) {
				res = mid;
				e = mid - 1;
			}else {
				s = mid +1 ;
			}
		}
		
		return res;
	}

	private boolean isDivisorPossible(int[] nums, int threshold, int mid) {
		int sum = 0 ;
		for(int num : nums) {
			sum += num/mid;
			sum += num%mid!=0?1:0;
		}
		
		return sum<=threshold;
	}

}
