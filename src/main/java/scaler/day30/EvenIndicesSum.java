package scaler.day30;

import java.util.Arrays;

public class EvenIndicesSum {

	/*You are given an array A of length N and Q queries given by the 2D array B of size Q*2. Each query consists of
	two integers B[i][0] and B[i][1].
	For every query, the task is to calculate the sum of all even indices in the range A[B[i][0]…B[i][1]].*/

	public static int[] getEvenIndexSum(int[] a, int[][] b) {

		int[] result = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int startIndex = b[i][0];
			int endIndex = b[i][1];
			int sum = 0;
			for (int j = startIndex; j <= endIndex; j++) {
				if (j % 2 == 0) {
					sum += a[j];
				}
			}
			result[i] = sum;
		}
		return result;
	}

	public static int[] getPrefixSum(int[] a) {

		int[] prefixSum = new int[a.length];
		prefixSum[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			if (i % 2 == 0) {
				prefixSum[i] = prefixSum[i - 1] + a[i];
			} else {
				prefixSum[i] = prefixSum[i - 1];
			}
		}
		return prefixSum;
	}

	public static int[] getEvenIndexSum1(int[] prefixSum, int[][] b) {

		int[] result = new int[b.length];
		int sum = 0;
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
		int[][] b = {{0, 2}, {1, 4}};

		System.out.println("without using prefix sum");
		int[] res = getEvenIndexSum(a, b);
		System.out.println(Arrays.toString(res));

		System.out.println("after using prefix sum");
		int[] res1 = getEvenIndexSum1(getPrefixSum(a), b);
		System.out.println(Arrays.toString(res1));
	}
}
