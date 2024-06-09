package practices.array;

public class FindSubArraySum {

	/*Given an array arr[] of non-negative integers and an integer sum, find a subArray that adds to a given sum.
	Note: There may be more than one subArray with sum as the given sum, print first such subArray.*/

	public static void findSubArraySum(int[] a, int givenSum) {
		boolean notFound = true;
		for (int i = 0; i < a.length; i++) {
			int currentSum = 0;
			for (int j = i; j < a.length; j++) {
				currentSum += a[j];
				if (currentSum == givenSum) {
					notFound = false;
					System.out.println("current sum fount from " + i + " to " + j);
				}
			}
		}
		if (notFound) {
			System.out.println("current sum is not found");
		}
	}

	public static void main(String[] args) {
		int[] a = {1, 4};
		int givenSum = 0;
		findSubArraySum(a, givenSum);
	}
}
