package com.linkedlist;

import com.linkedlistbase.ListNode;

public class ReverseKGroup {
	
	private ListNode[] reverseList(ListNode head) {
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
	
	public ListNode reverseKGroup(ListNode head, int k) {
		if(k == 1 ) return head;
		int kthCount = 1;
		ListNode temp = head;
		ListNode ptr = head;
		ListNode forwad = head;
		ListNode firstHead = null;
		ListNode prevList = null;
		while(forwad != null) {
			if(kthCount == k) {
				ptr = forwad.next;
				forwad.next = null;
				ListNode arrayNode[] = reverseList(temp);
				if(prevList !=null)
					prevList.next = arrayNode[0];
				if(firstHead == null) {
					firstHead = arrayNode[0];
				}
				
				prevList = arrayNode[1];
				temp = ptr;
				forwad = ptr;
				kthCount = 1;
			}else {
				forwad = forwad.next;
				if(forwad != null) kthCount++;
			}
			
			
		}
		if(kthCount < k) {
			prevList.next = ptr;
		}
		
		return firstHead;
	}
}
