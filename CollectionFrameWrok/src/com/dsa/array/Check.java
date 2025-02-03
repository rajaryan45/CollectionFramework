package com.dsa.array;

public class Check {
	public boolean check(int[] nums) {
		int i = 0 ,count = 0;
		if(nums.length <=2)return true;
		int n = nums.length;
		int temp = nums[i] ;
		for(i = 1;i<=(n+1);i++) {
			
			if(temp > nums[i%n]) {
				count++;
				System.out.println(temp);
			}
			temp = nums[i%n];
			if (count>1) {
				return false;
			}
			
		}
		
		return true;
	}
}
