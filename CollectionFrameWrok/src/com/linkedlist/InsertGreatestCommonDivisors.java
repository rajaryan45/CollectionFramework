package com.linkedlist;

import com.linkedlistbase.ListNode;

public class InsertGreatestCommonDivisors {
	
	private int getGcd(int a, int b) {
		while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
	}
	
	public ListNode insertGreatestCommonDivisors(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode temp = head.next;
		ListNode prev = head;
		
		while(temp != null) {
			ListNode newNode = new ListNode(getGcd(temp.val, prev.val));
			newNode.next = prev.next;
			prev.next = newNode;
			prev = prev.next.next;
			temp = temp.next;
		}
		return head;
		
	}

}
