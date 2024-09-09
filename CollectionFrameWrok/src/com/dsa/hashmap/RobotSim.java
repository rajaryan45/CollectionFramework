package com.dsa.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class RobotSim {
	  public int robotSim(int[] commands, int[][] obstacles) {
	     int[][] coordinates = {{0,1},{1,0},{0,-1},{-1,0}};
	     int[] curPos = {0,0};
	     int dist = 0 ;
	     HashMap<Integer, HashSet<Integer>> hMap = new HashMap<Integer, HashSet<Integer>>();
	     for(int[] obstacle :obstacles) {
	    	 if(!hMap.containsKey(obstacle[0])) {
	    		 hMap.put(obstacle[0], new HashSet<>() );
	    	 }
	    	 hMap.get(obstacle[0]).add(obstacle[1]);
	     }
	     int curDir = 0 ;
	     for(int command: commands) {
	    	 if(command == -1) {
	    		 curDir = (curDir+1)%4;
	    		 continue;
	    	 }
	    	 if(command == -2) {
	    		 curDir = (curDir-1);
	    		 if(curDir == -1) {
	    			 curDir = 3;
	    		 }
	    		 continue;
	    	 }
	    	 
	    	 int[] direction = coordinates[curDir];
	    	 for(int step =  0 ; step < command ; step++) {
	    		 int newX = curPos[0] + direction[0];
	    		 int newY = curPos[1] + direction[1];
	    		 if(hMap.containsKey(newX) && hMap.get(newX).contains(newY)) {
	    			 break;
	    		 }
	    		 curPos[0] = newX;
	    		 curPos[1] = newY;
	    	 }
	    	 dist = Math.max(dist, (curPos[0]*curPos[0])+(curPos[1]*curPos[1]) );
	     }
	     
	     return dist;
	  }
}
