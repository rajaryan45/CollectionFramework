package com.dsa.matrix;
/*
 *  https://leetcode.com/problems/set-matrix-zeroes/
 */
public class SetZeroes {
	
	private void setRow(int[][] matrix, int i, int set) {
		for(int j = 0 ; j<matrix[i].length ; j++) {
			if(matrix[i][j] != 0)matrix[i][j] = set;
		}
	}
	
	private void setColumn(int[][] matrix, int j, int set) {
		for(int i = 0 ; i < matrix.length ;i++) {
			if(matrix[i][j] != 0)matrix[i][j] = set;
		}
	}
	
	public void setZeroes(int[][] matrix) {
		for(int i = 0 ; i < matrix.length ; i++) {
			for(int j = 0 ; j<matrix[i].length ; j++) {
				if(matrix[i][j] == 0) {
					setRow(matrix, i, -1);
					setColumn(matrix, j, -1);
				}
			}
		}
		
		for(int  i = 0 ; i< matrix.length ; i++) {
			for(int j = 0 ;j<matrix[i].length ; j++) {
				if(matrix[i][j] == -1) {
					matrix[i][j] = 0;
				}
			}
		}
	}

}
