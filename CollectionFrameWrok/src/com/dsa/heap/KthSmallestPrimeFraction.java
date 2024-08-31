package com.dsa.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestPrimeFraction {
public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int res[] = new int[2];
        PriorityQueue<double[]> minHeap = new PriorityQueue<double[]>(new Comparator<double[]>() {
        	public int compare(double[] a,double[] b) {
        		return a[0] <= b[0] ? -1 :1;
        	}
		});
        int n = arr.length;
        for(int i = 0 ; i< n-1; i++) {
        	minHeap.offer(new double[] { ((double)arr[i]/arr[n-1]),i,n-1 });
        }
        
        while(k > 0) {
        	double[] element = minHeap.poll();
        	int a = (int)element[1];
        	int b = (int)element[2];
        	if(a<(b-1)) {
        		minHeap.offer(new double[] { ((double)arr[a]/arr[b-1]),a,(b-1) });
        	}
        	k--;
        	if(k==0) {
        		res[0] = arr[a];
        		res[1] = arr[b];
        	}
        }
        
        return res; 
        	
    }
}
