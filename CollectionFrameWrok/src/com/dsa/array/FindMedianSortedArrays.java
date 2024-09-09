package com.dsa.array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindMedianSortedArrays {

	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double res = 0 ; 
		int i = 0;
		int len = nums1.length + nums2.length;
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		Arrays.stream(nums1).forEach(pQueue::offer);
		Arrays.stream(nums2).forEach(pQueue::offer);
		int k = len/2;
		if(len%2 == 0) {
			while(i<k-1) {
				pQueue.poll();
				i++;
			}
			int temp = pQueue.poll();
			return (double)(temp+pQueue.poll())/2;
		}else {
			while(i<k) {
				pQueue.poll();
				i++;
			}
			return pQueue.peek();
		}
		  
	}

}
