package com.dsa;

import java.util.*;

import com.dsa.tree.BinaryTreeBuilder;
import com.dsa.tree.TreeNode;
import com.dsa.tree.bfs.IsSubPath;
import com.linkedlist.InsertGreatestCommonDivisors;
import com.linkedlist.MiddleNode;
import com.linkedlist.ModifiedList;
import com.linkedlist.PalindromeLinkedList;
import com.linkedlist.ReverseKGroup;
import com.linkedlist.SortList;
import com.linkedlist.SpiralMatrix;
import com.linkedlistbase.ListNode;
import com.linkedlistbase.ReverseList;


public class LinkedListPrac {
	
	public static ListNode listBuilder(int[] ar) {
		ListNode listNode = new ListNode(ar[0]);
		ListNode headListNode = listNode;
		for(int i = 1 ; i < ar.length ; i++) {
			ListNode listNode2 = new ListNode(ar[i]);
			System.out.println(listNode + "  " + listNode2 + "  " + ar[i]);
			listNode.next = listNode2;
			listNode = listNode2;
		}
		return headListNode;
	}
	
	
	public static void main(String[] args) {
		int[] ar = {1,2};
		
		ListNode headListNode = listBuilder(ar);
		ListNode temp = headListNode;
		temp.displayNodes(headListNode);
		System.out.println(headListNode);
		
//		BinaryTreeBuilder builder = new BinaryTreeBuilder();
//		Integer[] arr = {2,null,2,null,2,null,1};
//
//	    TreeNode root = builder.buildTree(arr);
//	    
//	    IsSubPath obj = new IsSubPath();
		
		ReverseKGroup reverseKGroup = new ReverseKGroup();
		headListNode = reverseKGroup.reverseKGroup(headListNode, 2);
		temp.displayNodes(headListNode);
//		while(head != null) {
//			System.out.print(head.val + " ");
//			head = head.next;
//		}
// 	    System.out.println("res : "+ obj.isSubPath(headListNode, root));
		
		
//		while(headNode!=null) {
//			System.out.println(headNode.val + "  ");
//			headNode = headNode.next;
//		}
		
	}
	
}
