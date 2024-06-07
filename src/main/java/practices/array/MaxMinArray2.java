package practices.array;

import java.util.Arrays;

public class MaxMinArray2 {

	//	Program to find the minimum (or maximum) element of an array

	//using in-build function - Arrays.sort(arr);
	public static void printMinMaxElement(int[] a) {

		Arrays.sort(a);
		System.out.println("Min element = " + a[0] + " and Max element = " + a[a.length - 1]);
	}

	//using in-build function - Math.max(int a, int b);

	public static void getMinMaxElement(int[] a) {
		int minElement = Integer.MAX_VALUE;
		int maxElement = Integer.MIN_VALUE;
		for (int i : a) {
			maxElement = Math.max(maxElement, i);
			minElement = Math.min(minElement, i);
		}
		System.out.println("max element = " + maxElement + " and min element  = " + minElement);
	}

	public static void main(String[] args) {
		int[] a = {1, 423, 6, 46, 34, 23, 13, 53, 4};
		printMinMaxElement(a);

		//another way of in-build function
		getMinMaxElement(a);
	}
}
