package com.dsa.array;

import java.util.HashMap;


public class MaximumSubarraySum {
	 public long maximumSubarraySum(int[] nums, int k) {
		 int i = 0, j = 0;
	        long cSum = 0, mSum = 0;
	        HashMap<Integer, Integer> hMap = new HashMap<>();

	        while (j < nums.length) {
	            // If the current number is already in the HashMap and within the window, move the start of the window
	            if (hMap.containsKey(nums[j]) && hMap.get(nums[j]) >= i) {
	                // Remove the sum of elements that are being excluded from the window
	                while (i <= hMap.get(nums[j])) {
	                    cSum -= nums[i];
	                    i++;
	                }
	            }

	            // Add the current number to the sum
	            cSum += nums[j];
	            // Update the HashMap with the current number's index
	            hMap.put(nums[j], j);

	            // If the window size equals k, check if it's the maximum sum
	            if (j - i + 1 == k) {
	                mSum = Math.max(mSum, cSum);
	                // Slide the window by removing the leftmost element
	                cSum -= nums[i];
	                i++;
	            }

	            j++;
	        }

	        return mSum;
}
}
