package com.linkedlistbase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


import com.dsa.TwoSumClass;
import com.dsa.array.CheckSubarraySum;
import com.dsa.array.FindDuplicate;
import com.dsa.array.LongestOnes;
import com.dsa.array.MaximumSubArray;
import com.dsa.array.MaximumSubarraySum;
import com.dsa.array.RemoveDuplicate;
import com.dsa.array.SubarraysDivByK;
import com.dsa.array.bs.MaxDistance;
import com.dsa.array.bs.MinDays;
import com.dsa.array.bs.MinimizedMaximum;
import com.dsa.array.sort.QuickSort;
import com.dsa.array.sort.SortColors;
import com.dsa.array.string.BeautySum;
import com.dsa.array.string.FindRepeatedDnaSequences;
import com.dsa.array.string.GroupAnagrams;
import com.dsa.array.topointers.RotateArray;
import com.dsa.graph.FloodFill;
import com.dsa.heap.KthLargestNumber;
import com.dsa.heap.KthSmallestPrimeFraction;
import com.dsa.heap.MaxHeap;
import com.dsa.heap.TopKFrequent;
import com.dsa.numbertherory.KthFactor;
import com.dsa.slidingwindow.CharacterReplacement;
import com.dsa.stringprac.LargestOddNumber;
import com.dsa.stringprac.LengthOfLongestSubstring;

public class Main {
	
	public static void main(String[] args) {
		try {
			
			FloodFill obj = new FloodFill();
			int[][] arr = new int[][] {{1,1,1},{1,1,0},{1,0,1}};
			obj.floodFill(arr,1,1,2);
			for(int x[]:arr) {
				for(int j : x)
					System.out.print(j);
				System.out.println(' ');
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
