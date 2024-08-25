package com.linkedlist;

import java.util.PriorityQueue;

import com.linkedlistbase.ListNode;

public class SortList {
	public ListNode sortList(ListNode head) {
		if(head == null)
			return null;
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		ListNode temp = head;
		while(temp!=null) {
			minHeap.offer(temp.val);
			temp = temp.next;
		}
		temp = head;
		while(!minHeap.isEmpty()) {
			temp.val = minHeap.poll();
			temp = temp.next;
		}
		
		return head;
    }
}
