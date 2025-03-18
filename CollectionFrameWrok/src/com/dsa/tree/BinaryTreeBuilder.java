package com.dsa.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.dsa.tree.bfs.BottomView;
import com.dsa.tree.bfs.GoodNodes;
import com.dsa.tree.bfs.IsValidBST;
import com.dsa.tree.bfs.KthLargestLevelSum;
import com.dsa.tree.bfs.LevelOrderBottom;
import com.dsa.tree.bfs.RightSideView;
import com.dsa.tree.dfs.SumNumbers;

public class BinaryTreeBuilder {
	public TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if (arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }
	
	// GFG
	public Node buildNode(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            return null;
        }

        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (!queue.isEmpty() && i < arr.length) {
        	Node current = queue.poll();

            if (arr[i] != null) {
                current.left = new Node(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new Node(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }
    // Helper function to print the tree (Pre-order Traversal)
    public void printNode(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            printNode(root.left);
            printNode(root.right);
        }
    }
    
    public void printTree(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printTree(root.left);
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeBuilder builder = new BinaryTreeBuilder();

        // Example input: [1, 2, null, 3]
        Integer[] arr = {1,3,2};

        Node root = builder.buildNode(arr);

        // Print the constructed tree
        builder.printNode(root);
        System.out.println("\n\n");
        BottomView bottomView = new BottomView();
        System.out.println(bottomView.bottomView(root));
        
    }
}
