package scaler.day29;

public class GoodPair {

	/*
	Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
	Check if any good pair exist or not.
*/

	public static boolean isGoodPair(int[] a, int number) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == number) {
					return true;
				}
			}
		}
		return false;
	}


	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4};
		int b = 7;

		boolean isGoodPair = isGoodPair(a, b);
		System.out.println(isGoodPair);

		int[] c = {1, 2, 4};
		int d = 4;

		boolean isGoodPair2 = isGoodPair(c, d);
		System.out.println(isGoodPair2);

		int[] e = {1, 2, 2};
		int f = 4;

		boolean isGoodPair3 = isGoodPair(e, f);
		System.out.println(isGoodPair3);
	}
}
