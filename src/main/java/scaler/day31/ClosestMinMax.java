package scaler.day31;

public class ClosestMinMax {

	/*Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the
	maximum value of the array
	and at least one occurrence of the minimum value of the array.*/


	public static int getSmallestArray(int[] a) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxIndex = -1;
		int minIndex = -1;
		int length = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= max) {
				max = a[i];
				maxIndex = i;
			} else if (a[i] <= min) {
				min = a[i];
				minIndex = i;
			}

			if (maxIndex < minIndex) {
				length = minIndex - maxIndex + 1;
			} else {
				length = maxIndex - minIndex + 1;
			}
		}
		return length;
	}


	public static void main(String[] args) {
		int[] a = {2, 6, 1, 6, 9, 10,1};
		int smallestLength = getSmallestArray(a);
		System.out.println(smallestLength);
	}
}
