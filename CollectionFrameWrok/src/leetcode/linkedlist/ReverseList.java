package leetcode.linkedlist;

public class ReverseList {
	public ListNode reverseList(ListNode head) {
        
		if(head == null || head.next == null) return head;
		
		ListNode ptrListNode = null;
		ListNode tempListNode = head.next;
		
		head.next = null;
		while(tempListNode.next != null) {
			ptrListNode = tempListNode.next;
			tempListNode.next = head;
			head = tempListNode;
			tempListNode = ptrListNode;
		}
		tempListNode.next = head;
		
		return tempListNode;
		
	}
}
