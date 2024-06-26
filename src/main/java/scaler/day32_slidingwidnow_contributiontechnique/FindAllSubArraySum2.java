package scaler.day32_slidingwidnow_contributiontechnique;

public class FindAllSubArraySum2 {

	/*You are given an integer array A of length N.
	You have to find the sum of all subarray sums of A.
	More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
	A subarray sum denotes the sum of all the elements of that subarray.
			Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.*/

	public static int getSum(int[] a){
		int totalSum = 0;
		for(int i=0;i<a.length;i++){
			int currSum = 0;
			for(int j=i;j<a.length;j++){
				currSum+=a[j];
				totalSum+=currSum;
			}
		}
		return totalSum;
	}

	public static void main(String[] args) {
		int[] a ={1,2,3,4,5};
		int totalSum = getSum(a);
		System.out.println(totalSum);
	}
}
