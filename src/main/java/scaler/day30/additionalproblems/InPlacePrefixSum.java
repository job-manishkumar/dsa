package scaler.day30.additionalproblems;

import java.util.Arrays;

public class InPlacePrefixSum {
	/*Given an array A of N integers. Construct prefix sum of the array in the given array itself.*/

	public static void getInPlacePrefixSum(int[] a) {
		for (int i = 1; i < a.length; i++) {
			a[i] = a[0] + a[i];
		}
	}

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5};
		getInPlacePrefixSum(a);
		System.out.println(Arrays.toString(a));
	}
}
