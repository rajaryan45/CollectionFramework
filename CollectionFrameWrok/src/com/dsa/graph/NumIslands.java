package com.dsa.graph;

public class NumIslands {
	private void dfs(int row,int col, int rows, int cols,char[][] grid,boolean[][] visited) {
		if(row<0 || row >= rows || col<0 || col >= cols || grid[row][col] == '0' || visited[row][col])
			return;
		visited[row][col] = true;
		
		dfs(row-1, col, rows, cols, grid, visited);
		dfs(row+1, col, rows, cols, grid, visited);
		dfs(row, col-1, rows, cols, grid, visited);
		dfs(row, col+1, rows, cols, grid, visited);
	}
	
	public int numIslands(char[][] grid) {
	        int rows = grid.length;
	        int cols = grid[0].length;
	        int isLands = 0;
	        boolean[][] visited = new boolean[rows][cols];
	        for(int i = 0 ; i<rows ; i++) {
	        	for(int j = 0 ; j<cols ; j++) {
	        		if(grid[i][j] == '1' && !visited[i][j]) {
	        			dfs(i, j, rows, cols, grid, visited);
	        			isLands++;
	        		}
	        	}
	        }
	        return isLands;	
 	 }
}
