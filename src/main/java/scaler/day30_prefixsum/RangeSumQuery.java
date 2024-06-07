package scaler.day30_prefixsum;

import java.util.Arrays;

public class RangeSumQuery {

	/*You are given an integer array A of length N.
	You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
	For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
	More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.*/

	//brut force method1
//tc => O(N2)
	public static int[] getSum(int[] a, int[][] b) {

		int[] result = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int startIndex = b[i][0];
			int endIndex = b[i][1];
			int sum = 0;
			for (int j = startIndex; j <= endIndex; j++) {
				sum += a[j];
			}
			result[i] = sum;
		}
		return result;
	}


	//using prefix sum

	public static int[] getPrefixSum(int[] a) {

		int[] prefixSum = new int[a.length];
		prefixSum[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + a[i];
		}
		return prefixSum;
	}

	public static int[] getSum2(int[] prefixSum, int[][] b) {

		//calculation on queries
		int sum = 0;
		int[] result = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int startIndex = b[i][0];
			int endIndex = b[i][1];
			if (i == 0) {
				sum = prefixSum[endIndex];
			} else {
				sum = prefixSum[endIndex] - prefixSum[startIndex - 1];
			}
			result[i] = sum;
		}
		return result;
	}


	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5};
		int[][] b = {{0, 3}, {1, 2}};
		int[] res = getSum(a, b);
		System.out.println(Arrays.toString(res));

		System.out.println("using prefix sum");
		int[] res1 = getSum2(getPrefixSum(a), b);
		System.out.println(Arrays.toString(res1));
	}
}
