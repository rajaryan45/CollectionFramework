package com.dsa.array;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarraysDivByK {
	  public int subarraysDivByK(int[] nums, int k) {
	  int res = 0;
	  HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
	  ArrayList<Integer> arList = new ArrayList<Integer>();
	  hMap.put(0, 1);
	  if(nums.length == 0)return 0;
//	  if(nums.length == 1 && nums[0]%k==0)
//		  return 1;
	  
	  int cSum = 0 ;
	  for(int i = 0 ; i<nums.length;  i++) {
		  cSum += nums[i];
		  int mod = cSum%k;
		  mod = mod<0? (cSum%k)+k : mod;
		  System.out.println(mod);
		  if(hMap.containsKey(mod)) 
			  res += hMap.get(mod);
		  
		  hMap.put(mod,hMap.getOrDefault(mod, 0)+1);
	  }
	  
	  return res;
	  }
}
