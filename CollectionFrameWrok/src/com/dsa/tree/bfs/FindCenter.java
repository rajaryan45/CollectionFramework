package com.dsa.tree.bfs;

public class FindCenter {
	public int findCenter(int[][] edges) {
        int[] ar1 = edges[0];
        int[] ar2 = edges[1];
        if(ar1[0]==ar2[0])
        	return ar1[0];
        if(ar1[0]== ar2[1])
        	return ar1[0];
        else {
			return ar1[1];
		}
    }
}
