package com.linkedlist;

import com.linkedlistbase.ListNode;

public class MiddleNode {
	public ListNode middleNode(ListNode head) {
		if(head == null || head.next == null) return head;
		if(head.next.next == null)return head.next;
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next !=null ) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
}
