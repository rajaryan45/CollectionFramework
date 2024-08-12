package com.linkedlistbase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.dsa.TwoSumClass;
import com.dsa.array.MaximumSubArray;
import com.dsa.array.TopKFrequent;
import com.dsa.array.string.GroupAnagrams;
import com.dsa.array.topointers.RotateArray;

public class Main {
	
	public static void main(String[] args) {
		try {
			System.out.println("main");
			RotateArray obj = new RotateArray();
			int[] ar = {1,2,3,4,5,6,7};
			obj.rotate(ar, 3);
			for(int num : ar) {
				System.out.print(num + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
