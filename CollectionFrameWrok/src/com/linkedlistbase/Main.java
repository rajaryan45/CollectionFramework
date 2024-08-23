package com.linkedlistbase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



import com.dsa.TwoSumClass;
import com.dsa.array.LongestOnes;
import com.dsa.array.MaximumSubArray;
import com.dsa.array.MaximumSubarraySum;
import com.dsa.array.RemoveDuplicate;
import com.dsa.array.TopKFrequent;
import com.dsa.array.sort.QuickSort;
import com.dsa.array.string.GroupAnagrams;
import com.dsa.array.topointers.RotateArray;
import com.dsa.heap.MaxHeap;
import com.dsa.stringprac.LargestOddNumber;
import com.dsa.stringprac.LengthOfLongestSubstring;

public class Main {
	
	public static void main(String[] args) {
		try {
			
//			int ar[] = {1,1,1,7,8,9};
			LongestOnes obj = new LongestOnes();
			int res = obj.longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3);
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
