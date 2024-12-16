package decDaily;

public class MinimumSize {
	public int minimumSize(int[] nums, int maxOperations) {
		  int r=0;
	        for(int num : nums){
	            r = Math.max(num,r);
	        }
	        int l=1;
	        int res=0;
	        while(l<=r){
	            int mid = l + (r-l)/2;
	            if(isPossible(nums,mid,maxOperations)){
	                res = mid;
	                r = mid-1;
	            }else{
	                l = mid+1;
	            }
	        }
	        return res;
	}

	private boolean isPossible(int[] nums, int maxBallsAllowed, int maxOperations) {
		  int operations=0;
	        for(int num : nums){
	            if(num > maxBallsAllowed){
	                int bags = (int) Math.ceil(num / (double) maxBallsAllowed);
	                operations+=bags-1;
	            }
	            if(operations > maxOperations){
	                return false;
	            }
	        }
	        return true;
	}

}
