package scaler.day29;

public class MinMaxSum {

	/*Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.*/

	public static int getSum(int[] a) {

		int minElement = Integer.MAX_VALUE;
		int maxElement = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] < minElement) {
				minElement = a[i];
			} else if (a[i] > maxElement) {
				maxElement = a[i];
			}
		}
		return minElement + maxElement;
	}

	public static void main(String[] args) {

		int[] a = {-2, 1, -4, 5, 3};
		int sum = getSum(a);
		System.out.println(sum);


	}
}
