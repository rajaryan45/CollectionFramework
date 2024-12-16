package decDaily;

public class CanMakeSubsequence {
	public boolean canMakeSubsequence(String str1, String str2) {
		int i = 0, j = 0;
		while(i < str1.length() && j < str2.length()) {
			if((str1.charAt(i) == str1.charAt(j)) || ((char)(str1.charAt(i) + 1) == str1.charAt(j))) {
				j++;
			}
			i++;
		}
		if(j>str2.length())
			return true;
		return false;
	}
}
