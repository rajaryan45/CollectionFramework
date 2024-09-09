package com.dsa.daily;

import java.util.Arrays;

public class MissingRolls {
	 public int[] missingRolls(int[] rolls, int mean, int n) {
	       	int mSum = 0 ;
	       	for(int x : rolls) {
	       		mSum += x;
	       	}
	       	int i = 0 ;
	       	int nSum = (mean*(rolls.length+n) - mSum);
	       	if(nSum<n || nSum > n*6)
	       		return new int[] {};
	       	int[] res = new int[n];
	       	while(nSum >0) {
	       		int dice = Math.min((nSum-n+1), 6);
	       		nSum -= dice;
	       		n--;
	       		res[i] = dice;
	       		i++;
	       	}
	       	return res;
	    }
}
