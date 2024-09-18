package com.dsa.tree.dfs;

import java.util.ArrayList;
import java.util.List;

import com.dsa.tree.TreeNode;
import com.linkedlistbase.ListNode;

public class SumNumbers {
	
	private void getNumbers(TreeNode root,int num, List<Integer> arr) {
		
		int res = num*10 + root.val;
		if(root.left == null && root.right == null) {
			arr.add(res);
			return;
		}
		if(root.left != null)
			getNumbers(root.left, res,arr);
		
		if(root.right != null)
			getNumbers(root.right, res,arr);
	}
	
	public int sumNumbers(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		getNumbers(root, 0, res);
		int sum = 0 ;
		for(int x : res) {
			sum += x;
		}
		return sum;
	}

}
