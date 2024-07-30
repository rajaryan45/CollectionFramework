package com.dsa;

import java.util.*;

import com.linkedlistbase.ListNode;


public class LinkedListPrac {
	
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		int n = 2;
		
		ListNode listNode = new ListNode(ar[0]);
		
		for(int i = 1 ; i < ar.length ; i++) {
			ListNode listNode2 = new ListNode(ar[i]);
			listNode.next = listNode2;
		}
		
		
	}
	
}
