package com.dsa.array;

public class SortColors {
	public void sortColors(int[] nums) {
		int[] colors = new int[] {0,0,0};
		for(int i : nums) {
			colors[i]++;
		}
		int j = 0 ; 
		int i = 0 ; 
		while(i<nums.length) {
			if(colors[j] > 0) {
				nums[i] = j;
				i++;
				colors[j]--;
			}else {
				j++;
			}
		}
	}
}
