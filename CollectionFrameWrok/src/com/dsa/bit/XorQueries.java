package com.dsa.bit;

public class XorQueries {
	public int[] xorQueries(int[] arr, int[][] queries) {
		int[] prefix = new int[arr.length];
		prefix[0] = arr[0];
		int xor = prefix[0];
		for(int i = 1 ; i< arr.length; i++) {
			xor ^= arr[i];
			prefix[i] = xor;
		}
		int[] ans = new int[queries.length];
		for(int i = 0 ; i<queries.length ; i++) {
			int left = queries[i][0];
			int right = queries[i][1];
			ans[i] = prefix[right];
			if(left>0) {
				ans[i] ^= prefix[left-1];
			}
			
		}
		return ans;
		
    }
}
