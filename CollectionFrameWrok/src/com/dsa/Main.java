package com.dsa;

import com.dsa.matrix.Rotate;

public class Main {

	public static void main(String[] args) {
		Rotate rotate = new Rotate();
		int[][]matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		rotate.rotate(matrix);
		for(int[] a:matrix) {
			for(int x : a) {
				System.out.print(x + " ");
			}
			System.out.println();
		}

	}

}
