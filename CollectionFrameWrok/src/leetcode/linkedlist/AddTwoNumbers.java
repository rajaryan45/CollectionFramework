package leetcode.linkedlist;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode head = null;	
	ListNode prev = null;
	int sum = 0, carry = 0;
	while(l1!=null || l2!=null || carry != 0 ) {
		int val1 = (l1!=null)?l1.val:0;
		int val2 = (l2!=null)?l2.val:0;
		sum = val1+val2+carry;
		ListNode newNode = new ListNode(sum%10);
		carry = sum / 10;
		if(head == null) {
			head = newNode;
			prev = head;
		}else {
			prev.next = newNode;
			prev = newNode;
		}
		if (l1!=null) {
			l1 = l1.next;
		}
		if (l2 != null) {
			l2 = l2.next;
		}
		
	}
	return head;
   }
}
