package com.dsa.matrix;

public class MatrixMain {
	public static void main(String[] args) {
		
		int[][] matrix = {{1,3} ,{2,6},{8,10},{15,18} };
		
		Merge merge = new Merge();
		int[][] res = merge.merge(matrix);
		System.out.println(res);
		for(int i = 0 ; i <res.length ; i++) {
			for(int j = 0; j<res[i].length;j++) {
				System.out.print(res[i][j] + " " );
			}
			System.out.println();
		}
	}
}
