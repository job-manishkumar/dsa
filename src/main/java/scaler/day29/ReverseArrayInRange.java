package scaler.day29;

import java.util.Arrays;

public class ReverseArrayInRange {

/*	Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].*/

	public static void getReverse(int[] a, int startIndex, int endIndex) {

		for (int i = startIndex; i <= endIndex; i++, endIndex--) {
			int temp = a[i];
			a[i] = a[endIndex];
			a[endIndex] = temp;
		}
	}

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4};
		int b = 2;
		int c = 3;

		getReverse(a, b, c);
		System.out.println(Arrays.toString(a));

	}
}
