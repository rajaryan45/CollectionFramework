package com.dsa.tree.bfs;

import com.dsa.tree.TreeNode;

public class IsValidBST {
	
	private boolean checkBST(TreeNode root, long l , long r) {
		if(root == null)return true;
		
		if(!(l< root.val  && root.val < r)){
			return false;
		}
		return checkBST(root.left, l,(long) root.val) && checkBST(root.right,(long) root.val, r);
	}
	
	public boolean isValidBST(TreeNode root) {
		
		return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

}
