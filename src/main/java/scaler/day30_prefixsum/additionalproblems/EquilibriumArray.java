package scaler.day30_prefixsum.additionalproblems;

public class EquilibriumArray {

	/*You are given an array A of integers of size N.
	Your task is to find the equilibrium index of the given array
	The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum
	of elements at higher indexes.
	If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is
	 considered as 0.*/

	//brut force method

	public static int countEquilibriumArray(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int lowerIndexSum = 0;
			int highIndexSum = 0;
			for (int j = 0; j < i; j++) {
				lowerIndexSum += a[j];
			}
			for (int k = i + 1; k < a.length; k++) {
				highIndexSum += a[k];
			}
			if (lowerIndexSum == highIndexSum) {
				return i;
			}
		}
		return -1;

	}


	// method 2
	public static int findEquilibriumArray(int[] a) {

		int totalsum = 0;
		for (int i = 0; i < a.length; i++) {
			totalsum += a[i];
		}
		int leftSum = 0;
		for (int i = 0; i < a.length; i++) {
			int rightSum = totalsum - leftSum - a[i];
			if (rightSum == leftSum) {
				return i;
			}
			leftSum += a[i];

		}
		return -1;
	}

//using prefixSum

	public static int[] getPrefixSum(int[] a) {
		int[] prefixSum = new int[a.length];
		prefixSum[0] = a[0];

		for (int i = 1; i < a.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + a[i];
		}
		return prefixSum;
	}


	public static int findEquilibriumIndex(int[] prefixSum) {

		for (int i = 0; i < prefixSum.length; i++) {
			int leftSum = 0;
			int rightSum = 0;
			if (i == 0) {
				rightSum = prefixSum[prefixSum.length - 1] - prefixSum[i];
			} else {
				leftSum = prefixSum[i - 1];
				rightSum = prefixSum[prefixSum.length - 1] - prefixSum[i];
			}
			if (leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] a = {-7, 1, 5, 2, -4, 3, 0};
		int index = countEquilibriumArray(a);
		System.out.println(index);


		int index1 = findEquilibriumArray(a);
		System.out.println(index1);

		int index2 = findEquilibriumIndex(getPrefixSum(a));
		System.out.println(index2);


	}
}
