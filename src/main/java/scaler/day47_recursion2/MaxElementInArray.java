package scaler.day47_recursion2;

public class MaxElementInArray {

	/*Given an array A of size N, write a recursive function that returns the maximum element of the array.*/

	//using loop
	public static int getMaxElement(int[] a) {

		int maxElement = Integer.MIN_VALUE;
		for (int i : a) {
			if (i > maxElement) {
				maxElement = i;
			}
		}
		return maxElement;
	}

	//using recursion.. but index = a.length-1
	public static int getMaxElement(int[] a, int index) {

		int maxElement = Integer.MIN_VALUE;
		//base condition
		if (index == 0 && a[index] > maxElement) {
			maxElement = a[index];
			return maxElement;
		}
		//main logic
		return Math.max(a[index], getMaxElement(a, index - 1));
	}

	//using recursion but... index starting from 0;
	public static int getMaxElement1(int[] a, int index) {

		int maxElement = Integer.MIN_VALUE;
		if (index == a.length - 1 && a[index] > maxElement) {
			maxElement = a[index];
			return maxElement;
		}
		return Math.max(a[index], getMaxElement1(a, index + 1));


	}

	public static void main(String[] args) {
		//int[] a = {12, 10, 3, 4, 5};
		int[] a = {1, 5, 80, 40};
		System.out.println("using loop");
		int max = getMaxElement(a);
		System.out.println(max);

		System.out.println("using recursion");
		int max1 = getMaxElement(a, a.length - 1);
		System.out.println(max1);

		System.out.println("using recursion but second way");
		int max2 = getMaxElement1(a, 0);
		System.out.println(max2);
	}
}
