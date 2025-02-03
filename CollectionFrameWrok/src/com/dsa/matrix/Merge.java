package com.dsa.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Merge {
	public int[][] merge(int[][] intervals){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]); 
            }
            return Integer.compare(a[0], b[0]); // Compare first column
        });
        for (int[] row : intervals) {
            pq.offer(row);
        }
        int i = 0 ;
        while(!pq.isEmpty()) {
        	intervals[i++] = pq.poll(); 
        }
        List<int []> mergeList = new ArrayList<int[]>();
        for(int[] interval: intervals) {
        	int n = mergeList.size()-1;
        	if(mergeList.isEmpty() || mergeList.get(n)[1] < interval[0]) {
        		mergeList.add(interval);
        	}else {
        		mergeList.get(n)[1] = Math.max(mergeList.get(n)[1], interval[1]); 
			}
        
        }
        return mergeList.toArray(new int[mergeList.size()][]);

	}

}
