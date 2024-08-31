package com.dsa.array.bs;

import java.util.Arrays;

public class MaxDistance {
	private boolean isPossible(int[] position,int m, int mide) {
		int lastPos = position[0];
		int count = 1;
		for(int i = 1 ; i<position.length ;i++) {
			if(position[i] - lastPos >= mide) {
				lastPos = position[i];
				count += 1;
			}
			if(count >= m) return true;
		}
		return false;
	}
	
	 public int maxDistance(int[] position, int m) {
		 if(m > position.length )return -1;
	    Arrays.sort(position);
	    int n = position.length;
	    int s = position[0];
	    int e = position[n-1] - position[0];
	    int ans =0;
	    while(s<=e) {
	    	int mid = s + (e-s)/2;
	    	if(isPossible(position,m,mid)) {
	    		ans = mid;
	    		s = mid + 1;
	    	}else {
				e = mid - 1;
			}
	    }
	    return ans;
	  }

}
