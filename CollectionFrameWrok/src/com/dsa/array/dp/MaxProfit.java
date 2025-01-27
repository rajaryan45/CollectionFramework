package com.dsa.array.dp;

public class MaxProfit {
	/*
	 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
	 */
	/* 
	 * this one is brute force method this will not clear all the test cases
	 * it will show TLE.
	 * O(n^2)
	 */
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		for(int i =0 ; i<prices.length ; i++) {
			for(int j = i+1 ; j<prices.length ;j++) {
				int curProfit = prices[j] - prices[i];
				maxProfit = Math.max(maxProfit, curProfit);
			}
		}
		return maxProfit;
	}
	
	/*
	 * Optimisation 
	 */
	
	public int maxProfit1(int[] prices) {
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		for(int i = 0  ; i<prices.length; i++) {
			if(minPrice > prices[i]) {
				minPrice = prices[i];
			}
			maxProfit = Math.max(maxProfit, (prices[i]-minPrice));
		}
		return maxProfit;
	}
}
