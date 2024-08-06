package com.dsa.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;

public class TopKFrequent {
	public int[] topKFrequent(int[] nums, int k) {
	      List<Integer> res = new ArrayList<Integer>(); 
	      HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	      for(int num: nums) {
	    	  hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
	      }
	      
	      List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
	      entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
	      
	      int[] topK = new int[k];
	        for (int i = 0; i < k; i++) {
	            topK[i] = entryList.get(i).getKey();
	        }
	      return topK;
	}
}
