package com.dsa.stringprac;

public class GetLucky {
	  public int getLucky(String s, int k) {
	   
		  int count = 0 ;
		  StringBuilder numStr = new StringBuilder();
		  for(int i =0 ; i<s.length(); i++) {
			  numStr.append(s.charAt(i)-'a' + 1);
		  }
		  int res = 0 ;
		  while(count<k) {
			  res = 0 ;
			  for(int i = 0 ; i<numStr.length();i++) {
				  res += (numStr.charAt(i)-'0');
			  }
			  count++;
			  numStr = new StringBuilder(Integer.toString(res));
		  }
		  
		  return res;
	   }
}
