package com.dsa.array.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
	private int partition(List<Integer> arr, int p , int r) {
		int pivot  = arr.get(r); 
		int i = p - 1; 
		for(int j = p ; j < r-1 ; j++) {
			if(arr.get(j) <= pivot) {
				i = i + 1; 
				int temp = arr.get(i);
				arr.set(i, arr.get(j));
				arr.set(j, temp);
			}
		}
		int temp  = arr.get(r);
		arr.set(r, arr.get(i+1));
		arr.set(i+1, temp);
		return i+1;
	}
	
	public void getQuickSort(List<Integer>ar, int p , int r) {
		if(p<r) {
			int q = partition(ar, p, r);
			getQuickSort(ar,p,q-1);
			getQuickSort(ar,q+1,r);
		}
	}
}
