package com.dsa.matrix;

public class MatrixMain {
	public static void main(String[] args) {
		SetZeroes setZeroes = new SetZeroes();
		int[][] matrix = {{0,1,2,0} ,{3,4,5,2},{1,3,1,5} };
		
		setZeroes.setZeroes(matrix);
		System.out.println(matrix);
		for(int i = 0 ; i <matrix.length ; i++) {
			for(int j = 0; j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " " );
			}
			System.out.println();
		}
	}
}
