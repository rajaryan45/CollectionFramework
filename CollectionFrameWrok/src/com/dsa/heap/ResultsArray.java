package com.dsa.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ResultsArray {
	 public int[] resultsArray(int[][] queries, int k) {
	     int[] res = new int[queries.length];
	     HashMap<Integer, Integer>hMap = new HashMap<Integer, Integer>();
	     PriorityQueue<Integer> pQueue = new PriorityQueue<>(new Comparator<Integer>() {
	    	 public int compare(Integer a, Integer b) {
	    		  return (hMap.get(b)-hMap.get(a)); 
	    	 }
	     });
	     Integer[] dummy = new Integer[k];
	     int dist = 0 ;
	     for(int i = 0 ; i<queries.length ; i++) {
	    	 int xCor = queries[i][0];
	    	 int yCor = queries[i][1];
	    	 dist = Math.abs(xCor) + Math.abs(yCor);
	    	 hMap.put(i, dist);
	    	 pQueue.offer(i);
	    	 if (pQueue.size() > k) {
	                pQueue.poll(); 
	            }
	    	 if (pQueue.size() < k) {
	                res[i] = -1; 
	            } else {
	            	int l = pQueue.peek();
	                res[i] = (Math.abs(queries[l][0])+ Math.abs(queries[l][1]));
	            }
	     }
	     
	     
	     return res;
	 }
	 
}
