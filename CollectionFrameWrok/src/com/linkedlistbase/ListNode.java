package com.linkedlistbase;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode() {}
	public ListNode(int val) { this.val = val; }
	public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
	public void displayNodes(ListNode head) {
		while(head != null) {
			System.out.print(head.val + "  ");
			head = head.next;
		}
	}
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	    ListNode firstListNode = head;
	    ListNode secondListNode = head;
	    while(n-- > 0) {
	    	firstListNode = firstListNode.next;
	    }
	    if(firstListNode == null) {
	    	return secondListNode;
	    }
	    while(firstListNode.next != null) {
	    	secondListNode = secondListNode.next;
	    	firstListNode = firstListNode.next;
	    }
	    secondListNode.next = secondListNode.next.next;
	    
	    
	    return head;
	 }
}
