package com.dsa.array;

import java.util.Arrays;

public class FindDuplicate {
	public int findDuplicate(int[] nums) {
		int i = 0 , j = 0 ;
		int ar[] = new int[nums.length+1];
		Arrays.fill(ar, 0);
		for(i = 0 ; i<nums.length;i++) {
			ar[nums[i]]++;
			if(ar[nums[i]] == 2) {
				return nums[i];
			}
		}
		return 0;
    }
}
