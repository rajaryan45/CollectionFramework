package decDaily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckIfExist {
	
	public boolean checkIfExist(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int num : arr) {
			if(set.contains(num*2) || (num%2==0 && set.contains(num/2)) ) {
				return true;
			}
			set.add(num);
		}
	    
		return false;
	}

}
