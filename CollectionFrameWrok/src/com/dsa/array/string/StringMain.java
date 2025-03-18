package com.dsa.array.string;

public class StringMain {

	public static void main(String[] args) {
		String s1 = "bank";
		String s2 = "kanb";
		AreAlmostEqual areAlmostEqual = new AreAlmostEqual();
		System.out.println(areAlmostEqual.areAlmostEqual(s1, s2));

	}

}
