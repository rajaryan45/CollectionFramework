package com.dsa.biweekly;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MinOperations {
	public int minOperations(int[] nums, int k) {
		Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		int count = 0 ;
		for(Integer it: set) {
			if(it > k) {
				count++;
			}else {
				return -1;
			}
		}
		return count;
		
	}
}
