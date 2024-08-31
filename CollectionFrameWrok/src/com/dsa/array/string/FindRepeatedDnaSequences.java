package com.dsa.array.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRepeatedDnaSequences {
	 public List<String> findRepeatedDnaSequences(String s) {
		 List<String> res = new ArrayList<String>();
		 HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		 if(s.length() < 10) return res;
		 for(int i = 0 ; i <= s.length() - 10;i++) {
			 String subString = s.substring(i, i+10);
			 hmap.put(subString, hmap.getOrDefault(subString, 0)+1);
		 }
		 for(Map.Entry<String, Integer>entry : hmap.entrySet()) {
			 if(entry.getValue() >= 2) {
				 res.add(entry.getKey());
			 }
		 }
		 return res;
	 }

}
