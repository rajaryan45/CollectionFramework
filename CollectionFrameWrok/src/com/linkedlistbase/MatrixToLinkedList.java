package com.linkedlistbase;

import com.linkedlist.MergeKLists;

public class MatrixToLinkedList {
	public static ListNode[] generateLinkedLists(int[][] matrix) {
        ListNode[] lists = new ListNode[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length == 0) {
                lists[i] = null;
                continue;
            }

            // Initialize the head of the linked list
            ListNode head = new ListNode(matrix[i][0]);
            ListNode current = head;

            // Iterate over the remaining elements and create the linked list
            for (int j = 1; j < matrix[i].length; j++) {
                current.next = new ListNode(matrix[i][j]);
                current = current.next;
            }

            // Assign the head of the linked list to the corresponding index in the array
            lists[i] = head;
        }

        return lists;
    }

    // Helper function to print the linked lists
    public static void printLinkedLists(ListNode[] lists) {
        for (ListNode head : lists) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val);
                if (current.next != null) {
                    System.out.print("->");
                }
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 5},
            {1, 3, 4},
            {2, 6}
        };

        ListNode[] lists = generateLinkedLists(matrix);
        MergeKLists obj = new MergeKLists();
        ListNode temp = obj.mergeKLists(lists);
        while(temp!=null) {
        	System.out.println(temp.val + "  ");
        	temp = temp.next;
        }
        // Print the generated linked lists
        printLinkedLists(lists);
    }
}
