package leetcode.stack;

public class MainStack {

	public static void main(String[] args) {
		NextGreaterElements nextGreaterElements = new NextGreaterElements();
		
		int[] arr =	nextGreaterElements.nextGreaterElements(new int[] {1,2,3,4,3});
		for(int x : arr) {
			System.out.println(x);
		}
	}

}
