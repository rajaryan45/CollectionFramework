package com.dsa.tree.bfs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import com.dsa.tree.TreeNode;

public class KthLargestLevelSum {
	public long kthLargestLevelSum(TreeNode root, int k) {
		if(root == null)
			return -1;
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        PriorityQueue<Long>maxHeap = new PriorityQueue<Long>((a,b) -> Long.compare(b, a));
        queue.offer(root);
        queue.offer(null);
        long cSum = 0;
        while(!queue.isEmpty()) {
        	TreeNode tempNode = queue.poll();
        	if(tempNode == null) {
        		maxHeap.add(cSum);
        		cSum = 0;
        		if(!queue.isEmpty())queue.offer(null);
        	}else {
				cSum += tempNode.val;
				if(tempNode.left != null)queue.offer(tempNode.left);
				if(tempNode.right != null)queue.offer(tempNode.right);
			}	
        }
        if(maxHeap.size() < k)
        	return -1;
        int i = 0 ;
        while(i<k-1) {
			maxHeap.poll();
			i++;
		}
		return maxHeap.peek();
    }
}
