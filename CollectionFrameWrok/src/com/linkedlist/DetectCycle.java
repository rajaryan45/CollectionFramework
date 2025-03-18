package com.linkedlist;

import java.util.HashMap;

import com.linkedlistbase.ListNode;

public class DetectCycle {
	
	public ListNode detectCycle(ListNode head) {
		if(head == null || head.next == null) return null;
		
		HashMap<ListNode, Integer> hMap = new HashMap<ListNode, Integer>();
		while(head.next!=null) {
			if(hMap.containsKey(head)) {
				return head;
			}else {
				hMap.put(head, 1);
			}
		}
		return null;

	}

}
