package com.dsa.tree.bfs;


public class MaxAreaOfIsland {
	private int  dfs(int row,int col, int rows, int cols,int[][] grid,boolean[][] visited) {
		if(row<0 || row >= rows || col<0 || col >= cols || grid[row][col] == 0 || visited[row][col])
			return 0;
		visited[row][col] = true;
		int area = 1;
		area +=	dfs(row-1, col, rows, cols, grid, visited);
		area +=	dfs(row+1, col, rows, cols, grid, visited);
		area +=	dfs(row, col-1, rows, cols, grid, visited);
		area +=	dfs(row, col+1, rows, cols, grid, visited);
		return area;
	}
	 public int maxAreaOfIsland(int[][] grid) {
		 int rows = grid.length;
	        int cols = grid[0].length;
	        int isLands = 0;
	        boolean[][] visited = new boolean[rows][cols];
	        int ar = 0 , max = 0 ;
	        for(int i = 0 ; i<rows ; i++) {
	        	for(int j = 0 ; j<cols ; j++) {
	        		if(grid[i][j] == 1 && !visited[i][j]) {
	        			ar = dfs(i, j, rows, cols, grid, visited);
	        			max = Math.max(max, ar);
	        		}
	        	}
	        }
	        return max;	
	 
	 }
}
