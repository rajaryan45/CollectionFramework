package janDaily;

import java.util.HashSet;
import java.util.Set;

public class VowelStrings {
	public int[] vowelStrings(String[] words, int[][] queries) {
     
       int res[] = new int[queries.length];
       
       int prefix[] = new int[words.length];
       prefix[0] = isVowel(words[0]) ;
       for(int i = 1 ; i<words.length; i++) {
    	   prefix[i] = prefix[i-1] + isVowel(words[i]);
       }
       
       for(int i = 0 ; i< queries.length; i++) {
    	   int s = queries[i][0];
    	   int e = queries[i][1];
    	   int rs = prefix[e];
    	   if(s != 0 ) rs -=  prefix[e];
    	   res[i] = rs;
       }
       
       
       
       return res;
   }
	private int isVowel(String word) {
		Set<Character> hashSet = new HashSet<Character>();
		hashSet.add('a');
	    hashSet.add('e');
	    hashSet.add('i');
	    hashSet.add('o');
	    hashSet.add('u');
	       
		if(hashSet.contains(word.charAt(0))&& hashSet.contains(word.charAt(word.length()-1))) {
 		   return 1;
 	   }
		return 0;
	}
}
