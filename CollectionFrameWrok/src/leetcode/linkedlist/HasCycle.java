package leetcode.linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HasCycle {
	public boolean hasCycle(ListNode head) {
		if(head == null) return false;
		Set<ListNode> set = new HashSet<ListNode>();
		while (head!=null) {
			if(!set.contains(head)) {
				set.add(head);
			}else {
				return false;
			}
			
		}
		
		return true;
	}

}
