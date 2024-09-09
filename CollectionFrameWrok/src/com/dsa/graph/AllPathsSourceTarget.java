package com.dsa.graph;

import java.util.ArrayList;
import java.util.List;

public class AllPathsSourceTarget {
	private void dfs(int[][] graph, int ele,List<List<Integer>> resList , List<Integer> res) {
		res.add(ele);
		if(ele == graph.length-1) {
			resList.add(new ArrayList<Integer>(res));
			res.remove(res.size()-1);
			return;
		}else {
			for(int i:graph[ele])dfs(graph, i, resList, res);
		}
		res.remove(res.size()-1);
	}
	 public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		 System.out.println(graph.length);
		 List<List<Integer>> resList = new ArrayList<List<Integer>>();
		 List<Integer> res = new ArrayList<Integer>();
		 dfs(graph,0, resList, res);
		 return resList;
		 
	 }
}
