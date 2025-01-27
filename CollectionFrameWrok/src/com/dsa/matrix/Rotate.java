package com.dsa.matrix;

/*
 *  https://leetcode.com/problems/rotate-image/
 */


public class Rotate {
	private void reverse(int[][]nums, int i,int l , int e) {
		while(l<e) {
			int temp = nums[i][l];
			nums[i][l] = nums[i][e];
			nums[i][e] = temp;
			l++;
			e--;
		}
	}
	private void swap(int[][] nums, int i, int j) {
		int temp = nums[i][j];
	    nums[i][j] = nums[j][i];
	    nums[j][i] = temp;
	}
	public void rotate(int[][] matrix) {
		for(int i = 0 ; i < matrix.length ; i++) {
			for(int j = i ; j<matrix[i].length ; j++) {
					swap(matrix, i, j);
			}
		}
		
		for(int[] a:matrix) {
			for(int x : a) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
		
		for(int i = 0 ; i<matrix.length ; i++) {
			reverse(matrix,i, 0, matrix[i].length-1);
		}
		
		
	}
}
