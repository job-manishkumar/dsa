package scaler.day29_introductiontoarray.additionalproblems;

public class TimeToEquality {

	/*Given an integer array A of size N. In one second, you can increase the value of one element by 1.
	Find the minimum time in seconds to make all elements of the array equal.*/

	public static int getEquality(int[] a) {
		int maxElement = Integer.MIN_VALUE;
		for (int i : a) {
			if (i > maxElement) {
				maxElement = i;
			}
		}
		int count = 0;
		for (int i : a) {
			count += (maxElement - i);
		}
		return count;
	}

	public static void main(String[] args) {

		int[] a = {2, 4, 1, 3, 2};
		int count = getEquality(a);
		System.out.println(count);
	}
}
