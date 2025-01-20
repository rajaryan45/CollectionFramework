package gfg.linkedlist;

import leetcode.linkedlist.AddTwoNumbers;
import leetcode.linkedlist.ListNode;

public class LinkListBaseMain {
	public static Node listBuilder(int[] ar) {
		Node listNode = new Node(ar[0]);
		Node headListNode = listNode;
		for(int i = 1 ; i < ar.length ; i++) {
			Node listNode2 = new Node(ar[i]);
		//	System.out.println(listNode + "  " + listNode2 + "  " + ar[i]);
			listNode.next = listNode2;
			listNode = listNode2;
		}
		return headListNode;
	}
	
	public static void displayNode(Node node) {
		while (node != null) {
			System.out.print(node.data + "  ");
			node = node.next;
			
		}
	}
	
	public static void main(String[] args) {
		
		
		
		
	}

}
