package com.dsa.heap;

public class MaxHeap {
	private void getMaxHeap(int[] ar , int parentIndex) {
		int leftChild = (2*parentIndex)+1; 
		int rightChild = (2*parentIndex)+2;
		int largest;
		System.out.println("child "+ leftChild + "  " + rightChild);
		if(leftChild < ar.length && ar[leftChild] > ar[parentIndex]) {
			largest = leftChild;
		}else {
			largest = parentIndex;
		}
		if(rightChild < ar.length && ar[rightChild] > ar[largest]) {
			largest = rightChild;
		}
		System.out.println("index " +largest + "  " + parentIndex);
		if(largest != parentIndex) {
			int temp = ar[largest];
			ar[largest] = ar[parentIndex];
			ar[parentIndex] = temp;
			getMaxHeap(ar, largest);
		}
	}
	
	public void buildMaxHeap(int[] ar, int n ) {
		for(int i = (ar.length / 2) +1 ; i >= 0  ; i-- ) {
			
			System.out.println("\nat index : " + i);
			getMaxHeap(ar, i);
			for(int x : ar)
				System.out.print(x + "  ");
			System.out.println("\n");
		}
	}
}
