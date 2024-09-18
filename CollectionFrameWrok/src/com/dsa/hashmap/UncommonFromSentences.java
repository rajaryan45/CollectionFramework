package com.dsa.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UncommonFromSentences {
	
	public String[] uncommonFromSentences(String s1, String s2) {
		Pattern pattern = Pattern.compile("(\\w+)",Pattern.CASE_INSENSITIVE);
		Matcher matcher1 = pattern.matcher(s2);
		Matcher matcher2 = pattern.matcher(s1);
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		while(matcher1.find()) {
			String match = matcher1.group();
			hMap.put(match, hMap.getOrDefault(match, 0)+1);
		}
		
		while(matcher2.find()) {
			String match = matcher2.group();
			hMap.put(match, hMap.getOrDefault(match, 0)+1);
		}
		List<String> reStrings = new ArrayList<String>();
		for(Map.Entry<String, Integer> entry : hMap.entrySet()) {
			if(entry.getValue() == 1) {
				reStrings.add(entry.getKey());
			}
		}
		String[] res = new String[reStrings.size()];
		res = reStrings.toArray(res);  // Use this to convert ArrayList to String[]
		return res;
	}

}
