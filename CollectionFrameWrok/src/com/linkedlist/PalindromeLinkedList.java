package com.linkedlist;

import com.linkedlistbase.ListNode;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null)
			return true;
		System.out.println("in function : " + head + "  "+head.next);
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode next = head;
        while(fast != null && fast.next != null ) {
        	fast = fast.next.next;
        	next = next.next;
        	slow.next = prev;
        	prev = slow;
        	slow = next;
        }
        if(fast != null) {
        	slow = slow.next;
        }
        
        System.out.println("slow : " + slow.val + "   prev: "+ prev.val );
        while(slow != null && prev != null ) {
        	if(slow.val != prev.val) {
        		return false;
        	}
        	slow = slow.next;
        	prev = prev.next;
        }
        
        return true;
    }
}
