package scaler.day31_carryforwardandsubarray.additionalproblems;

public class CountingSubArraysSum {

	/*Given an array A of N non-negative numbers and a non-negative number B,
	you need to find the number of sub-arrays in A with a sum less than B.
	We may assume that there is no overflow.*/

	//brute force approach
	public static int getSum(int[] a, int b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if (sum < b) {
					count++;
				}
			}
		}
		return count;
	}


	public static void main(String[] args) {
		int[] a = {1, 11, 2, 3, 15};
		int b = 10;
		int count = getSum(a, b);
		System.out.println(count);
	}


}
