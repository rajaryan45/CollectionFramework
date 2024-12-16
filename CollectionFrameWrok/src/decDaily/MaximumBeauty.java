package decDaily;

import java.util.Arrays;

public class MaximumBeauty {
	public int maximumBeautyLOP(int[] nums, int k) {
		int i =  0 , j = 1 ; 
		int mxCount = 0 , count = 1 ;
		if(nums.length == 1)return 1;
		Arrays.sort(nums);
		while(j<nums.length) {
			if((nums[i]+k) >= (nums[j]-k)) {
				count++;
			}else {
				mxCount = Math.max(mxCount, count);
				while(i<=j && !((nums[i]+k) >= (nums[j]-k))) {
					i++;
					if(!((nums[i]+k) >= (nums[j]-k))) count--;
				}
			}
			mxCount = Math.max(mxCount, count);
			j++;
		}
		return mxCount;
	}
	
	public int maximumBeauty(int[] nums, int k) {
	int max=0;
    for(int num : nums){
        max = Math.max(max,num);
    }
    int count[] = new int[max+1];
    for(int num : nums){
        count[Math.max(num-k,0)]++;
        count[Math.min(num+k+1,max)]--;
    }
    int curSum=0;
    int maxSum=0;
    for(int c : count){
        curSum+=c;
        maxSum = Math.max(maxSum,curSum);
    }
    return maxSum;}
	
	
	
}
