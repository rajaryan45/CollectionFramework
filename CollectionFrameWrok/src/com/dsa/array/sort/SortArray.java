package com.dsa.array.sort;

public class SortArray {
	private void merge(int[] nums, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid; 
		int[] ar1 = new int[n1];
		int[] ar2 = new int[n2];
		for(int i = 0 ; i < n1; i++) {
			ar1[i] = nums[l+i];
		}
		for(int i = 0 ; i<n2 ; i++) {
			ar2[i] = nums[mid + 1 +i];
		}
		int i = 0 , j = 0 ;
		int k = l;
		while(i<n1 && j < n2) {
			if(ar1[i] <= ar2[j]) {
				nums[k] = ar1[i];
				i++;
			}else {
				nums[k] = ar2[j];
				j++;
			}
			k++;
		}
		
		while(i< n1) {
			
		}
			
	}
	
	private void mergeSort(int[] nums, int l , int r) {
		if(l >= r)
			return;
		int mid = l + (r-l)/2;
		mergeSort(nums, l, mid);
		mergeSort(nums, mid+1, r);
		
	}
	public int[] sortArray(int[] nums) {
         mergeSort(nums, 0, 0);
         return new int[] {1,2,3};
    }
}
