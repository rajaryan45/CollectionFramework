package com.linkedlist;

import com.linkedlistbase.ListNode;

public class SplitListToParts {
	 public ListNode[] splitListToParts(ListNode head, int k) {
	    ListNode temp = head;
	    int size = 0 ; 
	    while(temp != null) {
	    	size++;
	    	temp = temp.next;
	    }
	    ListNode res[] = new ListNode[k];
	    temp = head;
	    int avg = size/k;
	    int extra = size%k;
	    for(int i = 0 ; i<k ; i++) {
	    	if(temp == null) break;
	    	ListNode curHead = temp;
	    	ListNode prev = null;
	    	int len = 0 ; 
	    	while(temp != null && len<avg) {
	    		prev = temp;
	    		temp = temp.next;
	    		len++;
	    	}
	    	if(extra > 0 ) {
	    		prev = temp;
	    		temp = temp.next;
	    		extra--;
	    	}
	    	prev.next = null;
	    	res[i] = curHead;
	    }
	    return res;
	 }
}
