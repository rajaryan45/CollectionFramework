package com.linkedlist;

import java.util.Arrays;

import com.linkedlistbase.ListNode;

public class SpiralMatrix {
	public int[][] spiralMatrix(int m, int n, ListNode head){
		int[][] res = new int[m][n];
		for(int i = 0 ; i<m ; i++)
			Arrays.fill(res[i], -1);
		
		int lc = 0 , rc = n-1, tr = 0 , br = m-1;
		while(head != null) {
			for(int i = lc ; i<=rc; i++) {
				if(head == null) break;
				res[tr][i] = head.val;
				head = head.next;
			}
			tr++;
			
			for(int j = tr ; j<= br ; j++) {
				if(head == null) break;
				res[j][rc] = head.val;
				head = head.next;
			}
			rc--;
			
			for(int i = rc ; i>= lc ; i--) {
				if(head == null) break;
				res[br][i] = head.val;
				head = head.next;
			}
			br--;
			
			for(int j = br; j >= tr ; j--) {
				if(head == null) break;
				res[j][lc] = head.val;
				head = head.next;
			}
			lc++;
		}
		
		return res;
			
	}
}
