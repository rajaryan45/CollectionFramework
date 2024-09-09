package com.dsa.daily;

public class ChalkReplacer {
	
	public int chalkReplacer(int[] chalk, int k) {
		long cSum = chalk[0];
		for(int i = 1 ; i<chalk.length ;i++) {
			cSum+=chalk[i];
		}
		int rem =  (int) (k%cSum);
		int i = 0 ;
		for(i = 0 ; i<chalk.length;i++) {
			if(chalk[i] > rem) return i;
			rem -= chalk[i];
		}
		
		
		return i;
	}
}
