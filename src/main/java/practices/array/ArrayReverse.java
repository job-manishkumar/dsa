package practices.array;

import java.util.Arrays;

public class ArrayReverse {


	/*Array reverse or reverse a array means changing the position of each number of the given array to its opposite
	position from end, i.e. if a number is at position 1 then its new position will be Array.length, similarly if a
	number is at position 2 then its new position will be Array.length – 1, and so on.*/

	//brute force approach with using extra array

	public static int[] getReverse(int[] a) {

		int[] result = new int[a.length];
		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			result[j] = a[i];
		}
		return result;
	}

	//another approach
	public static void getReverse1(int[] a) {

		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] a = {4, 5, 1, 2};
		int[] res = getReverse(a);
		//print array
		for (int i : res) {
			System.out.print(i + " ");
		}

		System.out.println("\nanother approach");
		getReverse1(a);
		System.out.println(Arrays.toString(a));

	}
}
