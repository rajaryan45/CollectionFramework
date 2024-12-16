package decDaily;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PickGifts {
	public long pickGifts(int[] gifts, int k) {
		Queue<Long>pQueue = new PriorityQueue<Long>(Collections.reverseOrder());
		for(long gift: gifts) {
			pQueue.offer(gift);
		}
		for(int i = 0; i<k ; i++) {
			long gift = pQueue.poll();
			pQueue.offer((long) Math.sqrt(gift));
		}
		int sum = 0 ;
		while(!pQueue.isEmpty()) {
			sum += pQueue.poll();
		}
		return sum;}

}
