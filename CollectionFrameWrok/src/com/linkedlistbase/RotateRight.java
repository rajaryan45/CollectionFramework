package com.linkedlistbase;

public class RotateRight {
	
	public ListNode rotateRight(ListNode head, int k) {
		if(head == null) return head;
		int len = 1;
		ListNode temp = head;
		while(temp.next != null) {
			len++;
			temp = temp.next;
		}
		k = k % len;
		if(k == 0 )return head;
		
		ListNode prev = head;
		int i = 0;
		while(i != (len-k-1)) {
			prev = prev.next;
			i++;
		}
		temp = prev.next;
		prev.next = null;
		ListNode tail = temp;
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = head;
		return temp;
	}

}
