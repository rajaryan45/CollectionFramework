package com.dsa.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CalcEquation {
	
	private double dfs(String source, String target, double prod, HashSet<String> visited, HashMap<String, HashMap<String, Double>> hMap) {
		double ret = -1;
		visited.add(source);
		if(hMap.get(source).containsKey(target)) {
			ret = hMap.get(source).get(target) * prod;
		}else {
			for(String neighbour : hMap.get(source).keySet()) {
				if(!visited.contains(neighbour)) {
					ret = dfs(neighbour, target, prod * hMap.get(source).get(neighbour) , visited, hMap);
					if(ret != -1)
						break;
				}
			}
		}
		visited.remove(source);
		return ret;
	}
	
	public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
		double[] res = new double[queries.size()];
		HashMap<String, HashMap<String, Double>> hMap = new HashMap<String, HashMap<String,Double>>();
		for(int i = 0 ; i<equations.size(); i++) {
			String dividend = equations.get(i).get(0);
			String divisor = equations.get(i).get(1);
			double value = values[i];
			if(!hMap.containsKey(dividend)) {
				hMap.put(dividend, new HashMap<String, Double>());
			}
			if(!hMap.containsKey(divisor)) {
				hMap.put(divisor, new HashMap<String, Double>());
			}
			hMap.get(dividend).put(divisor, value);
			hMap.get(divisor).put(dividend, 1/value);
		}
		for(int i = 0 ; i<queries.size(); i++) {
			String dividend = queries.get(i).get(0);
			String divisor = queries.get(i).get(1);
			if(!hMap.containsKey(dividend) ||!hMap.containsKey(divisor)) {
				res[i] = -1.0;
			}else if (dividend.equals(divisor)) {
				res[i] = 1.0;
			}else {
				HashSet<String> visited = new HashSet<>();
				res[i] = dfs(dividend,divisor,1,visited,hMap);
			}
		}
		
		return res;
	}

}
