package com.dsa.tree.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import com.dsa.tree.TreeNode;

/*
 *   
 *   https://leetcode.com/problems/binary-tree-right-side-view/
 *   
 */
public class RightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		if(root == null) return res;
		Queue<TreeNode> pQueue = new LinkedList<TreeNode>();
		pQueue.add(root);
		boolean firstRightNode = true;
		pQueue.add(null);
		while(!pQueue.isEmpty()) {
			TreeNode curNode = pQueue.poll();
			if(curNode == null) {
				firstRightNode = true;
				if(!pQueue.isEmpty()) {
					pQueue.add(null);
				}
			}else {
				if(firstRightNode ) {
					res.add(curNode.val);
					firstRightNode = false;
				}
				if(curNode.right != null)
					pQueue.add(curNode.right);
				if(curNode.left != null)
					pQueue.add(curNode.left);
				
			}
		}
		
		return res;
	}
}
