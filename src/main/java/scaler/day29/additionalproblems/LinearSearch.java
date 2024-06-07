package scaler.day29.additionalproblems;

public class LinearSearch {

	/*Given an array A and an integer B, find the number of occurrences of B in A.*/


	public static int linearSearch(int[] a, int b) {
		int count = 0;
		for (int i : a) {
			if (b == i) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] a = {1, 2, 2};
		int b = 2;
		int countSearchElement = linearSearch(a, b);
		System.out.println(countSearchElement);
	}
}
