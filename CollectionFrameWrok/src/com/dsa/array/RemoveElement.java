package com.dsa.array;

public class RemoveElement {
	
	public int removeElement(int[] nums, int val) {
		int prev , i ; 
		for(i  = 0 ; i < nums.length ; i++) {
			if(nums[i] ==  val) {
				prev = i;
			}
		}
		return 0 ;
	}

}
