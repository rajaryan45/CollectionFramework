package leetcode.linkedlist;

/*
 *    
 *    Problem Link : https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
 *    topics: Two-pointer and linkedList
 *    
 */

public class DeleteMiddle {
	
	public ListNode deleteMiddle(ListNode head) {
		ListNode prev = null;
		ListNode slow = head;
		if(head == null || head.next == null ) {
			return null;
		}
		
		ListNode fast = head;
		while(fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
			
		}
		prev.next = slow.next;
		slow.next = null;
		
		
		return head;
	}
	
}
