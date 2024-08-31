package com.dsa.array.bs;

public class MinimizedMaximum {
	private boolean isPossible(int[] quantities, int mid, int n) {
		int count = 0 ;
		for(int i = 0 ; i<quantities.length; i++) {
			count += quantities[i] / mid;
			if(quantities[i]%mid > 0 ) count++;
		}
		if(count <= n)
			return true;
		return false;
	}
	
	 public int minimizedMaximum(int n, int[] quantities) {
		 
		 int e = 0 ;
		 for(int i =0 ; i<quantities.length ; i++) {
			 if(e < quantities[i]) e = quantities[i];
		 }
		 int s = 0 ; 
		 int ans = 0 ;
		 while(s<=e) {
			 int mid = ((e-s)/2) + s;
			 if(isPossible(quantities,mid,n)) {
				 ans = mid;
				 e = mid - 1;
			 }else {
				s = mid + 1;
			}
		 }
	        return ans;
	}
}
