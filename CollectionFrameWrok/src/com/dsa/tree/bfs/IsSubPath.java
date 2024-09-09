package com.dsa.tree.bfs;

import com.dsa.tree.TreeNode;
import com.linkedlistbase.ListNode;

public class IsSubPath {
	
	private boolean checkPath(ListNode tempNode, ListNode head, TreeNode root) {
		if(tempNode == null) return true;
		if(root == null)return false;
		boolean left = false,right = false;
		if(root.val == tempNode.val) {
			left = checkPath(tempNode.next, head, root.left);
			right = checkPath(tempNode.next, head, root.right);
		}else if(root.val == head.val) {
			left = checkPath(head.next, head, root.left);
			right = checkPath(head.next, head, root.right);
		}else {
			left = checkPath(head, head, root.left);
			right = checkPath(head, head, root.right);
		}
				
			
		
		return left || right;
	}
		
		
	private boolean checkNode(ListNode tempNode, ListNode head, TreeNode root) {
		boolean ans = false , left = false ,right = false;
		if(root == null) return false;
		if(root.val == head.val) {
			ans = checkPath(tempNode, head, root);
		} 
		if(!ans){
			left = checkNode(tempNode, head, root.left);
			right = checkNode(tempNode, head, root.right);
		}
		return ans || left || right;
	}
	
	  public boolean isSubPath(ListNode head, TreeNode root) {
		  
		  
		return checkNode(head, head, root);
	        
	   }
}
