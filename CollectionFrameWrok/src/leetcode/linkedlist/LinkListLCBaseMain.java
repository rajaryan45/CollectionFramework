package leetcode.linkedlist;

import gfg.linkedlist.Node;

public class LinkListLCBaseMain {
	public static ListNode listBuilder(int[] ar) {
		ListNode listNode = new ListNode(ar[0]);
		ListNode headListNode = listNode;
		for(int i = 1 ; i < ar.length ; i++) {
			ListNode listNode2 = new ListNode(ar[i]);
		//	System.out.println(listNode + "  " + listNode2 + "  " + ar[i]);
			listNode.next = listNode2;
			listNode = listNode2;
		}
		return headListNode;
	}
	
	public static void displayNode(ListNode node) {
		while (node != null) {
			System.out.print(node.val + "  ");
			node = node.next;
			
		}
	}
	
	public static void main(String[] args) {
		
		int[] ar1 = {2,4,3};

		
		ListNode l1 = listBuilder(ar1);
		ReverseList reverseList = new ReverseList();
		l1 = reverseList.reverseList(l1);
		System.out.println(" ");
		displayNode(l1);
		
		
	}

}
