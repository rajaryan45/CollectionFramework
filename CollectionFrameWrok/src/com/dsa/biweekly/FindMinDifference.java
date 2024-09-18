package com.dsa.biweekly;

import java.util.List;

public class FindMinDifference {
	
	public int findMinDifference(List<String> timePoints) {
        boolean mins[] = new boolean[1400];
        for(String time: timePoints) {
        	int h = Integer.parseInt(time.substring(0, 2));
        	int m = Integer.parseInt(time.substring(3, 5));
        	int minutes = h*60 + m;
        	if(mins[minutes]) return 0;
        	mins[minutes] = true;
        }
        int prev = -1;
        int firtVal= -1;
        int minDiff = Integer.MAX_VALUE;
        for(int cur = 0 ; cur< 1440; cur++) {
        	if(mins[cur]) {
        		if(prev == -1) {
        			firtVal = cur;
        			prev = cur;
        		}else {
					minDiff = Math.min(minDiff, cur- prev);
					prev = cur;
				}
        	}
        }
        if(prev != -1) {
        	minDiff = Math.min(minDiff, 1440 + firtVal-prev);
        }
        return minDiff;
    }

}
