package com.linkedlistbase;

public class ReverseList {
	
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null)
	        return head;
	    ListNode temp = head.next;
	    ListNode ptr = null;
	    head.next = null;
	    while(temp.next != null)
	    {
	        ptr = temp.next;
	        temp.next = head;
	        head = temp;
	        temp = ptr;
	    }        
	    temp.next = head;
	    return temp;
	}

}
