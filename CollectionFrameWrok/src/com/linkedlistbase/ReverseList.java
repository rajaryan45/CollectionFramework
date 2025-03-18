package com.linkedlistbase;

public class ReverseList {
	
	public ListNode[] reverseList(ListNode head) {
		ListNode[] array = new ListNode[2];
		array[1] = head;
		if(head == null || head.next == null)
	        return array;
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
	    array[0] = temp;
	    return array;
	}

}
