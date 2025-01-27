package com.dsa.array;

public class NextPermutation {
	private void reverse(int[]nums,int l , int e) {
		while(l<e) {
			int temp = nums[l];
			nums[l] = nums[e];
			nums[e] = temp;
			l++;
			e--;
		}
	}
	private void swap(int[] nums, int i, int j) {
		nums[i] = nums[i] + nums[j];
		nums[j] = nums[i] - nums[j];
		nums[i] = nums[i] - nums[j];
	}
	public void nextPermutation(int[] nums) {
		int i = 0 , j = 0 ; 
		if(nums.length == 1)return ;
		for(i = nums.length-2; i>= 0; i--) {
			if(nums[i] < nums[i+1]) {
				break;
			}
		}
		if(i < 0) {
			reverse(nums, 0, nums.length-1);
			return;
		}
		
		int k = 0;
		for( k = nums.length-1 ; k >= i+1 ; k-- ) {
			if(nums[i] < nums[k]) {
				break;
			}
		}
		swap(nums, i, k);
		reverse(nums, i+1, nums.length-1);
		
		
	}

}
