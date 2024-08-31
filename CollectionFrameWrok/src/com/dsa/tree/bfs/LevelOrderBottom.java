package com.dsa.tree.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import com.dsa.tree.TreeNode;

public class LevelOrderBottom {
	   public List<List<Integer>> levelOrderBottom(TreeNode root) {
	       List<List<Integer>> resList = new ArrayList<List<Integer>>();
	       Queue<TreeNode> queue = new LinkedList<TreeNode>();
	       
	       if(root == null)
	    	   return null;
	       
	       queue.offer(root);
	       queue.offer(null);
	       List<Integer> res = new ArrayList<Integer>();
	       while(!queue.isEmpty()) {
	    	   TreeNode tempNode = queue.poll();
	    	   if(tempNode == null) {
	    		   resList.add(0,res);
	    		   res = new ArrayList<>(); 
	    		   if(!queue.isEmpty())queue.offer(null);
	    	   }else {
	    		   res.add(tempNode.val);
	    		   if(tempNode.left!=null)queue.offer(tempNode.left);
	    		   if(tempNode.right!=null)queue.offer(tempNode.right);
			}
	    	   
	       }
	       
	       
	       return resList;
	    }
}
