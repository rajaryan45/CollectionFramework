package com.dsa.biweekly;

import java.util.ArrayList;
import java.util.List;

public class StableMountains {
	
	 public List<Integer> stableMountains(int[] height, int threshold){
		 if(height.length == 1)
			 return new ArrayList<Integer>();
		 
		 List<Integer> res = new ArrayList<Integer>();
		 
		 for(int i = 1 ; i<height.length ;i++) {
			 if(height[i] > 0 && height[i-1] > threshold) {
				 res.add(i);
			 }
		 }
		 return res;
		 
	 }

}
