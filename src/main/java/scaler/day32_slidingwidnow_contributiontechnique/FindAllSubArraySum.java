package scaler.day32_slidingwidnow_contributiontechnique;

public class FindAllSubArraySum {

	/*You are given an integer array A of length N.
	You have to find the sum of all subarray sums of A.
	More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
	A subarray sum denotes the sum of all the elements of that subarray.
			Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.*/

	public static int getSum(int[] a){
		int total = 0;
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				int sum = 0;
				for(int k=i;k<=j;k++){
					sum+=a[k];
				}
				total+=sum;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		int[] a ={1,2,3,4,5};
		int totalSum = getSum(a);
		System.out.println(totalSum);
	}
}
