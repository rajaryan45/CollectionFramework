package com.dsa.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class GetFinalState {
	public int[] getFinalState(int[] nums, int k, int multiplier) {
		for(int j =0 ; j<k ; j++) {
			int minValue = Integer.MAX_VALUE;
			for(int i = 0 ; i < nums.length ; i++) {
				if(nums[i] < minValue)
					minValue = nums[i];
			}
			for(int i = 0 ; i < nums.length; i++) {
				if(nums[i] == minValue) {
					nums[i] = nums[i] * multiplier;
					break;
				}
			}
		}
		return nums;
    }

}
