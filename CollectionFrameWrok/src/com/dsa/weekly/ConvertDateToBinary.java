package com.dsa.weekly;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertDateToBinary {
	private String getMatch(String date, String reg) {
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(date);
		if(matcher.find()) {
			return matcher.group(1);
		}
		return " ";
	}
	private String getBinary(String num) {
		int number = Integer.parseInt(num);
		StringBuilder stringBuilder = new StringBuilder();
		while(number>0) {
			stringBuilder.insert(0,number%2);
			number = number/2;
		}
		return stringBuilder.toString();
	}
	public String convertDateToBinary(String date) {
		String reString = getBinary(getMatch(date, "(\\d{4})-")) + "-" +getBinary(getMatch(date, "-(\\d{2})-"))+"-"+getBinary(getMatch(date, "\\d{4}-\\d{2}-(\\d{2})"));
		return reString;
	}
}
