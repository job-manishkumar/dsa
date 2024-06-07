package scaler.day31_carryforwardandsubarray;

import java.util.Arrays;

public class RangeSubArray {

	public static int[] getRangeSubArray(int[] a, int startIndex, int endIndex) {

		int[] result = new int[endIndex - startIndex + 1];
		int j = 0;
		for (int i = startIndex; i <= endIndex; i++) {
			result[j] = a[i];
			j++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = {4, 3, 2, 6};
		int b = 1;
		int c = 3;

		int[] res = getRangeSubArray(a, b, c);
		System.out.println(Arrays.toString(res));
	}

}
