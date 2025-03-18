package com.dsa.tree.bfs;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.AbstractMap.SimpleEntry;

import com.dsa.tree.Node;

public class BottomView {
	
	public ArrayList <Integer> bottomView(Node root){
		if(root == null) return null;
		Queue<AbstractMap.SimpleEntry<Node, Integer>> queue = new LinkedList<AbstractMap.SimpleEntry<Node,Integer>>();
		TreeMap<Integer, Integer> hMap = new TreeMap<Integer, Integer>();
		queue.add(new AbstractMap.SimpleEntry(root,0));
		while(!queue.isEmpty()) {
			AbstractMap.SimpleEntry<Node, Integer> varMap = queue.poll();
			Node varNode = varMap.getKey();
			int pos = varMap.getValue();
			hMap.put(varMap.getValue(), varNode.data);
			if(varNode.left !=null) {
				queue.add(new AbstractMap.SimpleEntry<Node, Integer>(varNode.left,pos-1));
			}
			if(varNode.right !=null) {
				queue.add(new AbstractMap.SimpleEntry<Node, Integer>(varNode.right,pos+1));
			}
		}
		
		return new ArrayList<Integer>(hMap.values());
	}
	
}
