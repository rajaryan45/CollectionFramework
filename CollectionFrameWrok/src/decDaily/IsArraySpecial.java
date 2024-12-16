package decDaily;

public class IsArraySpecial {
	public boolean[] isArraySpecial(int[] nums, int[][] queries) {
		int count[] = new int[nums.length];
		boolean[] res = new boolean[queries.length];
		
		count[0] = 0;
		for(int i = 1 ; i<nums.length; i++) {
			int s = (nums[i]%2==nums[i-1]%2)?1:0;
			count[i] = count[i-1] + s;
		}
		
		
		for(int i = 0 ; i<queries.length ; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			res[i] = ((count[s]-count[e]) == 0);
		}
		
		
		return res;
	}

}
