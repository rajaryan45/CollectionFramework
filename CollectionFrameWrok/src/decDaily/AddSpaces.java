package decDaily;

public class AddSpaces {
	
	public String addSpaces(String s, int[] spaces) {
		int n  = 0 , m = s.length();
		int i = 0 ;
		StringBuilder res = new StringBuilder();
		while(i<spaces.length) {
			
			res.append(s.substring(n,spaces[i])+" "); 
			n = spaces[i];
			i++;
		}
		res.append(s.substring(n, m));
		return res.toString();
	}

}
