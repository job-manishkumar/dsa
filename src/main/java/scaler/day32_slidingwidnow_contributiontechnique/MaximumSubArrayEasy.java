package scaler.day32_slidingwidnow_contributiontechnique;

public class MaximumSubArrayEasy {

	/*You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the
	sum of contiguous elements is maximum.
	But the sum must not exceed B.*/
	public static int getMaxSum(int[] a,int b) {

		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
				int currSum = 0;
			for (int j = i; j < a.length; j++) {
				currSum+=a[j];
				if(currSum<=b){
					maxSum = Math.max(maxSum,currSum);
				}
			}
		}
		return Math.max(maxSum, 0);

	}

	public static void main(String[] args) {
		int[] c = {13,13};
		int a = 5;
		int b = 12;
		int maxSum = getMaxSum(c,b);
		System.out.println(maxSum);
	}
}
