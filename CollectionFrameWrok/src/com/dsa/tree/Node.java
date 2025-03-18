package com.dsa.tree;

public class Node {
	public int data; // data of the node
    public int hd; // horizontal distance of the node
    public Node left, right; // left and right references

    // Constructor of tree node
    public Node(int key) {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
