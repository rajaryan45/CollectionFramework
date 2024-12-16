package decDaily;

public class MaxCount {
	public int maxCount(int[] banned, int n, int maxSum) {
		int count = 0 ; 
		
		boolean[] num = new boolean[10001];
		for(int i : banned) {
			num[i] = true;
		}
		int sum = 0 ;
		for(int i = 1 ; i<= n ; i++) {
			if(num[i] == true)continue;
			
			sum += i;
			if(sum > maxSum)break;
			count++;
		}
		
		
		return count ;
	}

}
