package practices.array;

import java.util.Arrays;

public class SortArray {

	/*Sorting an array in ascending order means arranging the elements from the smallest element to the largest
	element.*/

	// using in-build function
	public static void getSort(int[] a) {
		Arrays.sort(a);
	}

	//using bubble sort
	public static void getSort1(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = -0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = {0, 23, 14, 12, 9};
		System.out.println("using in-build function");
		getSort(a);
		System.out.println(Arrays.toString(a));
		int[] b = {0, 23, 14, 12, 9};
		System.out.println("using bubble sort");
		getSort1(b);
		System.out.println(Arrays.toString(b));
	}
}
