package com.dsa.array.string;
/*
 *  Group Anagrams 49
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupAnagrams {
	
	private String getKey(String str) {
		List<Integer> count = new ArrayList<>(Collections.nCopies(26,0));
		for(int i = 0 ; i<str.length();i++) {
			count.set((str.charAt(i)-'a'), (count.get(str.charAt(i)-'a') + 1));
		}
		StringBuilder sb = new StringBuilder();
		for(Integer num: count) {
			sb.append(num+'a');
		}
		return sb.toString();
	}
	public List<List<String>> groupAnagrams(String[] args){
		
		HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
		for(String temp : args) {
			String keyString = getKey(temp);
			hashMap.computeIfAbsent(keyString,k->new ArrayList<>()).add(temp);
		}
		
		 List<List<String>> groupedAnagrams = new ArrayList<>(hashMap.values());
		
		return groupedAnagrams;
		
	}
}
