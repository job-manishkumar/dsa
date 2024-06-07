package scaler.day30_prefixsum;

public class FairSumInArray {


	/*Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element
	from these indices makes the sum of even-indexed and odd-indexed array elements equal.*/

	public static int[] getEvenPrefixSum(int[] a) {

		int[] evenPrefixSum = new int[a.length];
		evenPrefixSum[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			if (i % 2 == 0) {
				evenPrefixSum[i] = evenPrefixSum[i - 1] + a[i];
			} else {
				evenPrefixSum[i] = evenPrefixSum[i - 1];
			}
		}
		return evenPrefixSum;
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


	public static int getFairSumCount(int[] evenPrefixSum, int[] oddPrefixSum, int[] a) {
		int n = a.length;
		//int[] result = new int[a.length];
		int totalCount = 0;
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (i == 0) {
				evenSum = oddPrefixSum[n - 1];
				oddSum = evenPrefixSum[n - 1] - evenPrefixSum[i];

			} else {
				evenSum = evenPrefixSum[i - 1] + (oddPrefixSum[n - 1] - oddPrefixSum[i]);
				oddSum = oddPrefixSum[i - 1] + (evenPrefixSum[n - 1] - evenPrefixSum[i]);
			}
			if (evenSum == oddSum) {
				count++;
			}

			totalCount += count;
		}
		return totalCount;
	}


	public static void main(String[] args) {
		int[] a = {2, 1, 6, 4};
		int count = getFairSumCount(getEvenPrefixSum(a), getOddPrefixSum(a), a);
		System.out.println(count);
	}


}
