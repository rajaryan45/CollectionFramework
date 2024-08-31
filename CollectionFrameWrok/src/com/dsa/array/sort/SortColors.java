package com.dsa.array.sort;

import java.util.HashMap;
import java.util.Map;

public class SortColors {
	public void sortColors(int[] nums) {
		if(nums.length == 0 || nums.length == 1)
			return;
	    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
	    for(int x : nums) {
	    	hmap.put(x, hmap.getOrDefault(x, 0)+1);
	    }
	    
	    int j = 0 , i = 0 ;
	    while(!hmap.isEmpty() && i < nums.length) {
	    	if(hmap.containsKey(j)) {
	    		nums[i] = j;
	    		i++;
		    	hmap.put(j, hmap.get(j)-1);
		    	if(hmap.get(j) == 0) {
		    		hmap.remove(j);
		    		j++;
		    	}
	    	}else {
				j++;
			}
	    	
	    }
    }
}
