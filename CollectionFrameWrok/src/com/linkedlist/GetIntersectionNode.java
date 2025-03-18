package com.linkedlist;

import java.util.HashMap;

import com.linkedlistbase.ListNode;

public class GetIntersectionNode {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		HashMap<ListNode, Integer> hMap = new HashMap<ListNode, Integer>();
		while(headA.next!= null) {
			hMap.put(headA, 0);
			headA = headA.next;
		}
		while(headB.next!=null) {
			if(hMap.containsKey(headB)) {
				return headB;
			}
			headB = headB.next;
		}
		
		return null;
	}

}
