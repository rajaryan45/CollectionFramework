package com.dsa.array.topointers;

import java.util.zip.ZipEntry;

public class RotateArray {
	private void reverse(int[]nums,int l , int e) {
		while(l<e) {
			int temp = nums[l];
			nums[l] = nums[e];
			nums[e] = temp;
			l++;
			e--;
		}
	}
	 public void rotate(int[] nums, int k) {
		 System.out.println("Rotate");
		 int z = k % nums.length;
	     if(z == nums.length || z == 0 ) return;
	     
	     reverse(nums, 0, nums.length - 1);
	     reverse(nums, 0, z - 1);
	     reverse(nums, z , nums.length - 1);
	 }
}
