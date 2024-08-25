package com.linkedlist;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import com.linkedlistbase.ListNode;

public class MergeKLists {
	public ListNode mergeKLists(ListNode[] lists) {
      PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
    	  public int compare(ListNode a, ListNode b) {
    		  return a.val - b.val;
    	  }
	});
      
      ListNode head = new ListNode(0);
      ListNode temp = head;
      for(int i = 0 ; i < lists.length ; i++)
    	 if(lists[i] != null) minHeap.offer(lists[i]);
      int i = 0 ;
      while(!minHeap.isEmpty()) {
    	  ListNode p = minHeap.poll();
    	  if(p.next != null) minHeap.offer(p.next);
    	  
    	  temp.next = p;
    	  temp = p;
    	  
      }
      
      
		return head.next;
    }
}
