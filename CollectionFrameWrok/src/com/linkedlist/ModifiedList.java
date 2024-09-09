package com.linkedlist;

import java.util.HashMap;

import com.linkedlistbase.ListNode;

public class ModifiedList {
	  public ListNode modifiedList(int[] nums, ListNode head) {
	      HashMap<Integer, ListNode>hashMap = new HashMap<Integer, ListNode>();
	      for(int x :nums) {
	    	  hashMap.put(x, null);
	      }
	      if(head == null )return null;
	      if(head.next == null &&  hashMap.containsKey(head.val))
	    	  return head;
	     
	      ListNode tempHead = null;
	      ListNode temp = null;
	      ListNode  front = head;
	      while(front != null) {
	    	  if(!hashMap.containsKey(front.val) && tempHead == null) {
	    		  tempHead = new ListNode(front.val);
	    		  temp = tempHead;
	    		  temp.next = null;
	    	  }else if(!hashMap.containsKey(front.val) && tempHead != null) {
	    		  temp.next = new ListNode(front.val);
	    		  temp = temp.next;
	    		  temp.next = null;
			}
	    	  front  = front.next;
	      }
		  
		  return tempHead;
	    }
}
