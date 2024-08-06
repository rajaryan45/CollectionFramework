package com.linkedlistbase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.dsa.TwoSumClass;
import com.dsa.array.MaximumSubArray;
import com.dsa.array.TopKFrequent;
import com.dsa.array.string.GroupAnagrams;

public class Main {
	
	public static void main(String[] args) {
		try {
		int[] nums = new int[] {5,4,-1,7,8};
		
		MaximumSubArray obj = new MaximumSubArray();
		System.out.println(obj.maxSubArray(nums));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
