package com.dsa.array.string;

import java.util.Arrays;

public class BeautySum {
	  public int beautySum(String s) {
		  int res = 0;
		  int arr[] = new int[26];
		  Arrays.fill(arr, 0);
		  int max = 0 , mint = Integer.MAX_VALUE;
		  for(int i=0 ; i<s.length(); i++) {
			  int j = s.charAt(i)-97;
			  arr[j]++;
			  if(arr[j] > max) max = arr[j];
			  if(arr[j] < mint) mint = arr[j];
		  }
		  
		  return max-mint;
		  
	  }
}
