package scaler.day29_introductiontoarray;

import java.util.Arrays;

public class RotateArray {

	/*Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times
	 towards the right.*/

	public static void getRotate(int[] a, int rotationTime) {
		int n = a.length;
		rotationTime = rotationTime % n;
		if (rotationTime != 0) {
			//reverse array
			getReverse(a, 0, n - 1);
			getReverse(a, 0, rotationTime-1);
			getReverse(a, rotationTime, n - 1);
		}
	}

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

		getRotate(a,b);
		System.out.println(Arrays.toString(a));
	}
}
