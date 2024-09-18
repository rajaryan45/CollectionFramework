package com.dsa;

import java.util.*;

import com.dsa.tree.BinaryTreeBuilder;
import com.dsa.tree.TreeNode;
import com.dsa.tree.bfs.IsSubPath;
import com.linkedlist.InsertGreatestCommonDivisors;
import com.linkedlist.ModifiedList;
import com.linkedlist.PalindromeLinkedList;
import com.linkedlist.SortList;
import com.linkedlist.SpiralMatrix;
import com.linkedlistbase.ListNode;


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
		int[] ar = {18,6,10,3};
		
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
		
		InsertGreatestCommonDivisors  obj = new InsertGreatestCommonDivisors();
		ListNode head = obj.insertGreatestCommonDivisors(headListNode);
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
// 	    System.out.println("res : "+ obj.isSubPath(headListNode, root));
		
		
//		while(headNode!=null) {
//			System.out.println(headNode.val + "  ");
//			headNode = headNode.next;
//		}
		
	}
	
}
