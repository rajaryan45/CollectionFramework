package leetcode.stack;

import java.util.Stack;

public class NextGreaterElements {
	public int[] nextGreaterElements(int[] nums) {
		Stack<Integer> stack = new Stack<Integer>();
		int numsLength = nums.length;
		int res[] = new int[numsLength];
		for(int i = 2*numsLength-1; i>= 0 ; i--) {
			while (!stack.isEmpty() && stack.peek() <= nums[i%numsLength]) {
				stack.pop();
			}
			if(i<numsLength) {
				if(stack.isEmpty()) {
					res[i] = -1;
				}else {
					res[i] = stack.peek();
				}
			}
			stack.push(nums[i%numsLength]);
		}
		return res;
	}
}
