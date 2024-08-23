package com.dsa.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
	public List<String> topKFrequent(String[] words, int k) {
        List<String> res = new ArrayList<String>();
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        for(String str : words) {
        	hMap.put(str, hMap.getOrDefault(str, 0)+1);
        }
        PriorityQueue<String> maxHeap = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String entry1, String entry2) {
                int val1 =  hMap.get(entry1);
                int val2 =  hMap.get(entry2);

                // If values are the same, compare by the length of the key
                if (val1 == val2) {
                    return entry2.compareTo(entry1);
                }

                return val1-val2; // otherwise, compare by value (descending order)
            }
        });
        
        
        for(Map.Entry<String, Integer> entry : hMap.entrySet()) {
        	maxHeap.add(entry.getKey());
        	if(maxHeap.size() > k) {
        		maxHeap.poll();
        	}
        }
        
        while(!maxHeap.isEmpty())
        	res.add(maxHeap.poll());
        
        Collections.reverse(res);
        
        return res;
    }
}
