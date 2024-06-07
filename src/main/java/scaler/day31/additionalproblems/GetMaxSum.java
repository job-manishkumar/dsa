package scaler.day31.additionalproblems;

public class GetMaxSum {

	/*You are given an integer array A of size N.
		You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost
		element of the array A.
				Find and return the maximum possible sum of the B elements that were removed after the B operations.
		NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
		Remove 3 elements from front and 0 elements from the back, OR
		Remove 2 elements from front and 1 element from the back, OR
		Remove 1 element from front and 2 elements from the back, OR
		Remove 0 elements from front and 3 elements from the back.
		*/

	public static int getMaxSum(int[] a, int b) {
		int totalSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < b; i++) {
			totalSum += a[i];
		}
		for (int i = 0; i < b; i++) {
			totalSum = totalSum - a[b - 1 - i] + a[a.length - 1 - i];
			maxSum = Math.max(totalSum, maxSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] a = {2, 3, -1, 4, 2, 1};
		int b = 4;
		int sum = getMaxSum(a, b);
		System.out.println(sum);
	}
}
