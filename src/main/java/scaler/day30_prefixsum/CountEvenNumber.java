package scaler.day30_prefixsum;

import java.util.Arrays;

public class CountEvenNumber {

	/*You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
	Each query consists of two integers B[i][0] and B[i][1].
	For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].*/

	//brut force method

	public static int[] getCountOfEven(int[] a, int[][] b) {

		int[] result = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int startIndex = b[i][0];
			int endIndex = b[i][1];
			int count = 0;
			for (int j = startIndex; j <= endIndex; j++) {
				if (a[j] % 2 == 0) {
					count++;
				}
			}
			result[i] = count;
		}
		return result;
	}

	//using prefix sum
	public static int[] getPrefixSum(int[] a) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a[i] = 1;
			} else {
				a[i] = 0;
			}
		}
		int[] prefixSum = new int[a.length];
		prefixSum[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + a[i];
		}
		return prefixSum;
	}

	public static int[] getCountOfEven1(int[] prefixSum, int[][] b) {
		int[] result = new int[b.length];
		int countEven = 0;
		for (int i = 0; i < b.length; i++) {
			int startIndex = b[i][0];
			int endIndex = b[i][1];

			if (i == 0) {
				countEven = prefixSum[endIndex];
			} else {
				countEven = prefixSum[endIndex] - prefixSum[startIndex - 1];
			}
			result[i] = countEven;
		}
		return result;
	}


	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[][] b = {{0, 2}, {2, 4}, {1, 4}};

		System.out.println(Arrays.toString(getCountOfEven(a, b)));
		System.out.println("using prefix sum");
		System.out.println(Arrays.toString(getCountOfEven1(getPrefixSum(a), b)));
	}
}
