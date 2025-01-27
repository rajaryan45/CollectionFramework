package com.dsa.array;

public class MainArray {
	public static void main(String args[]) {
		int[] a = new int[]{2,0,2,1,1,0};
		SortColors sortColors = new SortColors();
		sortColors.sortColors(a);
		
		for(int x: a) {
			System.out.print(x);
		}
	}
}
