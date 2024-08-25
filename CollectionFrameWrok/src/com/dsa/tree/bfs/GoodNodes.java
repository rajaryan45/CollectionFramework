package com.dsa.tree.bfs;

import com.dsa.tree.TreeNode;

public class GoodNodes {
	 private int getCount(TreeNode root,int maxNode) {
		 if(root == null) return 0;
		 int count =0 ;
			 
			 if(root.val >= maxNode) {
				 count = 1;
				 maxNode = root.val;
			 }
			count += getCount(root.left, maxNode);
			count += getCount(root.right, maxNode);
			
			return count;
		 
	 }
	
	 public int goodNodes(TreeNode root) {
	    
		 if(root == null) return 0;
		 return getCount(root, root.val);
	 }
}
