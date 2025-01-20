package leetcode.stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int size = nums1.length;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i = 0; i<nums1.length; i++) {
			hashMap.put(nums1[i], -1);
		}
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = nums2.length-1 ; i>= 0  ;i--) {
			while(!stack.isEmpty() && stack.peek() <= nums2[i] ) {
				stack.pop();
			}
			if(!stack.isEmpty()) {
				hashMap.put(nums2[i], stack.peek());
			}
			stack.push(nums2[i]);
		}
		for(int i = 0 ; i<nums1.length ;i++) {
			nums1[i] = hashMap.get(nums1[i]);
		}
		return nums1;
	}
}
