package gfg.daily;

public class KthElement {
	
	public int kthElement(int a[], int b[], int k) {
			int res = 0 ;
			int i = 0 , j = 0 ;
			while(i<a.length && j<b.length&& k>= 1) {
				if(a[i] < b[j]) {
					res = a[i];
					i++;
				}else {
					res = b[j];
					j++;
				}
				k--;
			}
			if(k==1) return res;
			
			while(i<a.length && k>=1) {
				res = a[i];
				k--;
			}
			
			while(j<b.length && k>=1) {
				res = a[j];
				k--;
			}
			
			return res;
	}

}
