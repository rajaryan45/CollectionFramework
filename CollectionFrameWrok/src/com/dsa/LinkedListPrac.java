package com.dsa;

import java.util.*;

import com.linkedlist.PalindromeLinkedList;
import com.linkedlistbase.ListNode;


public class LinkedListPrac {
	
	public static void main(String[] args) {
		int[] ar = {1,2,1,2,1};
		
		ListNode listNode = new ListNode(ar[0]);
		ListNode headListNode = listNode;
		for(int i = 1 ; i < ar.length ; i++) {
			ListNode listNode2 = new ListNode(ar[i]);
			System.out.println(listNode + "  " + listNode2 + "  " + ar[i]);
			listNode.next = listNode2;
			listNode = listNode2;
		}
		ListNode temp = headListNode;
		listNode.displayNodes(headListNode);
		System.out.println(headListNode);
		PalindromeLinkedList obj = new PalindromeLinkedList();
		boolean val = obj.isPalindrome(temp);
		System.out.println(" palindrome : " + val);
		
	}
	
}
