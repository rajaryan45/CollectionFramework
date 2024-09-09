package com.dsa.matrix;

import java.util.Arrays;

public class Construct2DArray {
	 public int[][] construct2DArray(int[] original, int m, int n) {
	      int[][] res = new int[m][n];
	      if(original.length  != (m*n)) return new int[][] {};
	      int i = 0 , j = 0 , k= 0 ;
	      
	      for(i = 0 ; i<m ; i++)
	    	  res[i] = Arrays.copyOfRange(original, i*n, (i*n)+n);
	      
	      return res;
	 }
	 
//	 public int[][] construct2DArray(int[] original, int m, int n) {
//	      int[][] res = new int[m][n];
//	      if(original.length  > (m*n)) return res;
//	      int i = 0 , j = 0 , k= 0 ;
//	      
//	      while(i<n && j < m) {
//	    	  res[j][i] = original[k];
//	    	  i++;
//	    	  k++;
//	    	  if(i>=n) {
//	    		  i = 0 ;
//	    		  j++;
//	    	  }
//	    	  
//	      }
//	      
//	      return res;
//	 }
	 
}
