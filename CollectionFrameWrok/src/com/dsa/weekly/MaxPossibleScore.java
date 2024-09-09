package com.dsa.weekly;

public class MaxPossibleScore {
	private boolean getNumber(int[] start , int d , int mid) {
		int choosen = start[0];
		for(int i = 1 ; i<start.length ; i++) {
			int low = choosen + mid;
			if( low > start[i]+d) {
				return false;
			}
			choosen = Math.max(start[i], low);
		}
		return true;
	}
	public int maxPossibleScore(int[] start, int d) {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i : start) {
			if(i>max)
				max = i;
			if(i<min)
				min = i;
		}
		int s = 0, e = max + d - min;
		while(s<=e) {
			int mid = (e-s)/2 + s;
			if(getNumber(start,d,mid)) {
				s = mid -1;
			}else {
				e = mid + 1;
			}
		}
		return e;
	}
}
