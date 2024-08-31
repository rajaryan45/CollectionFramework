package com.dsa.array;

import java.util.HashMap;

public class CheckSubarraySum {
	  public boolean checkSubarraySum(int[] nums, int k) {
		  HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		  int cSum = 0 ; 
		  hMap.put(0, -1);
		  for(int i = 0 ; i< nums.length ; i++) {
			  cSum += nums[i];
			  int mod = cSum % k;
			  if(hMap.containsKey(mod)) {
				  if(i - hMap.get(mod) >= 2) {
					  return true;
				  }
			  }else {
				  hMap.put(mod,i);
			}		  
		  }
		  return false;
	  }
}
