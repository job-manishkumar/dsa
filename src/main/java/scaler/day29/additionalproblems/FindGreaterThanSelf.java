package scaler.day29.additionalproblems;

public class FindGreaterThanSelf {

	/*Given an array A of N integers.
	Count the number of elements that have at least 1 elements greater than itself.*/

	public static int findElement(int[] a){

		int maxElement = Integer.MIN_VALUE;
		int maxElementFreq = 0;
		int arrayLength = a.length;
		for(int i:a){
			if(i>=maxElement){
				maxElement = i;
				maxElementFreq++;
			}
		}
		return arrayLength - maxElementFreq;
	}
	public static void main(String[] args) {
		 int[] a = {5, 5, 3};
		int countFreq =  findElement(a);
		System.out.println(countFreq);
	}
}
