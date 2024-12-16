package decDaily;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsPrefixOfWord {
	public int isPrefixOfWord(String sentence, String searchWord) {
		int res = -1;
		
		String ar[] = sentence.split(" ");
		String[] modifiedArray = new String[ar.length];
		for (int i = 0; i < ar.length; i++) {
		    modifiedArray[i] = " " + ar[i];
		}
		String regexString = "(\\s"+searchWord+"\\w*)";
		Pattern pattern = Pattern.compile(regexString);
		for(int i = 0 ; i<modifiedArray.length; i++) {
			Matcher matcher = pattern.matcher(modifiedArray[i]);
			if(matcher.find()) {
				return i+1;
			}
		}
		
		
		
		return res;
	}

}
