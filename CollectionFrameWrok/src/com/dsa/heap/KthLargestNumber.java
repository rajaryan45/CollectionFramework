package com.dsa.heap;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestNumber {
	public String kthLargestNumber(String[] nums, int k) {
		
		PriorityQueue<String> maxHeap = new PriorityQueue<String>(new Comparator<String>() {
			public int compare(String a, String b) {
				if((b.length() - a.length()) == 0 ) {
					BigInteger B = new BigInteger(b);
					BigInteger A = new BigInteger(a);
					return (B.compareTo(A));
				}else {
					return b.length() - a.length();
				}
			}
		});
		for(String s : nums) {
			maxHeap.add(s);
		}
		int i = 0 ;
		while(i<k-1) {
			maxHeap.poll();
			i++;
		}
		return maxHeap.peek();
    }
}
