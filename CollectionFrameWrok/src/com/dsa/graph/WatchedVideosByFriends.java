package com.dsa.graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class WatchedVideosByFriends {
	
	  public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
		  Queue<Integer> queue = new LinkedList<Integer>();
		  HashSet<Integer> hashSet = new HashSet<Integer>();
		  List<String> res = new ArrayList<String>();
		  int curLevel = 0;
		  queue.offer(id);
		  hashSet.add(id);
		  while(! queue.isEmpty()) {
			  int size = queue.size();
			  for(int i = 0 ; i< size; i++) {
				  int curId = queue.poll();
				  for(int friend : friends[curId]) {
					  if(!hashSet.contains(friend)) {
						  hashSet.add(friend);
						  queue.offer(friend);
					  }
				  }
				  
			  }
			  curLevel++;
			  if(curLevel == level) {
				  break;
			  }
		  }
		  HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		  int size = queue.size();
		  for(int i = 0 ; i<size ; i++) {
			  int friend = queue.poll();
			  for(String movie : watchedVideos.get(friend)) {
				  hMap.put(movie, hMap.getOrDefault(movie, 0)+1);
			  }
		  }
		  
		  List<Map.Entry<String, Integer>> list = new ArrayList<>(hMap.entrySet());
		  
		  
		  list.sort(new Comparator<Map.Entry<String, Integer>>() {
	            @Override
	            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
	                int val = entry1.getValue().compareTo(entry2.getValue());
	                if (val != 0) {
	                    return val;
	                } else {
	                    return entry1.getKey().compareTo(entry2.getKey());
	                }
	            }
	        });
		 
		  List<String> movies = new ArrayList<String>();
		  for(Map.Entry<String, Integer> entry : list) {
			  movies.add(entry.getKey());
		  }
		  
		  
		  return movies;
		  
	  }

}
