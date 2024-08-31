package com.dsa.array.bs;

public class MinDays {
	private boolean isPossible(int[] bloomDay, int minDay, int m , int k) {
		int count = 0 , total = 0;
		for(int i = 0 ; i< bloomDay.length; i++) {
			if(bloomDay[i] <= minDay) {
				count++;
				if(count == k) {
					total++;
					count = 0;
				}
				if(total >= m)
					return true;
			}else {
				count = 0;
			}
				
		}
		return false;
	}
	
	 public int minDays(int[] bloomDay, int m, int k) {
		 if(bloomDay.length < (long)m*k) return -1;
		 
	 int s = Integer.MAX_VALUE , e = Integer.MIN_VALUE ; 
	 for(int x: bloomDay) {
		 if(x < s)
			 s = x;
		 if(x > e)
			 e = x;
	 }
	 int ans = 0;
	 while(s<=e) {
		 int mid = (e-s)/2 + s;
		 if(isPossible(bloomDay,mid,m,k)) {
			 ans = mid;
			 e = mid - 1;
		 }else {
			s = mid + 1;
		}
	 }
	 return ans;
	 
	 }
}
