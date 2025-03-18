package com.dsa.array;

public class MainArray {
	public static void main(String args[]) {
		int[] a = new int[] {12,17,15,13,10,11,12};
		MaxAscendingSum maxAscendingSum = new MaxAscendingSum();
		System.out.println(maxAscendingSum.maxAscendingSum(a));
	}
}
