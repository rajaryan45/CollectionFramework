package gfg.linkedlist;

public class PairwiseSwap {
	public Node pairwiseSwap(Node head) {
        
		Node firstNode = head;
		Node prevNode = null;
		while(firstNode!= null && firstNode.next != null) {
			Node secondNode = firstNode.next;
			firstNode.next = secondNode.next;
			secondNode.next = firstNode;
			if(prevNode == null) {
				head = secondNode;
			}else {
				prevNode.next = secondNode;
			}
			prevNode = firstNode;
			firstNode = firstNode.next;
		}
		
		return head;
    }
}
