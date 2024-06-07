package scaler.day30_prefixsum.additionalproblems;

import java.util.Arrays;

public class OddIndexSum {

	/*You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of
	two integers B[i][0] and B[i][1].
	For every query, the task is to calculate the sum of all odd indices in the range A[B[i][0]…B[i][1]].

	Note : Use 0-based indexing*/

	public static int[] getOddIndexSum(int[] a, int[][] b) {

		int[] result = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int startIndex = b[i][0];
			int endIndex = b[i][1];
			int sum = 0;
			for (int j = startIndex; j <= endIndex; j++) {
				if (j % 2 != 0) {
					sum += a[j];
				}
			}
			result[i] = sum;
		}
		return result;
	}

	public static int[] getOddIndexSum1(int[] oddPrefixSum, int[][] b) {
		int sum = 0;
		int[] result = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int startIndex = b[i][0];
			int endIndex = b[i][1];
			if (i == 0) {
				sum = oddPrefixSum[endIndex];
			} else {
				sum = oddPrefixSum[endIndex] - oddPrefixSum[startIndex - 1];
			}
			result[i] = sum;
		}
		return result;
	}

	public static int[] getOddPrefixSum(int[] a) {

		int[] oddPrefixSum = new int[a.length];

		oddPrefixSum[0] = 0;
		for (int i = 1; i < a.length; i++) {
			if (i % 2 != 0) {
				oddPrefixSum[i] = oddPrefixSum[i - 1] + a[i];
			} else {
				oddPrefixSum[i] = oddPrefixSum[i - 1];
			}
		}
		return oddPrefixSum;

	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[][] b = {{0, 2}, {1, 4}};

		System.out.println("before prefix sum");
		int[] res = getOddIndexSum(a, b);
		System.out.println(Arrays.toString(res));

		System.out.println("after prefix sum");
		int[] res1 = getOddIndexSum1(getOddPrefixSum(a), b);
		System.out.println(Arrays.toString(res1));
	}
}
