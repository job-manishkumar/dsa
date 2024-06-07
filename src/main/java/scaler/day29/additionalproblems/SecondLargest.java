package scaler.day29.additionalproblems;

public class SecondLargest {

	/*You are given an integer array A. You have to find the second largest element/value in the array or report that
	no such element exists.*/

	public static int getSecondLargestElement(int[] a) {
		int maxElement = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		if (a.length <= 1) {
			return -1;
		}
		for (int i : a) {
			if (i > maxElement) {
				secondLargest = maxElement;
				maxElement = i;
			} else if (i > secondLargest && i != maxElement) {
				secondLargest = i;
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		int[] a = {2};
		int secondLargest = getSecondLargestElement(a);
		System.out.println(secondLargest);
	}
}
