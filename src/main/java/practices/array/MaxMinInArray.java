package practices.array;

public class MaxMinInArray {

//	Program to find the minimum (or maximum) element of an array

	//function to get max element in given array
	public static int getMaxElement(int[] a){

		int maxElement = Integer.MIN_VALUE;
		for(int i:a){
			if(i>maxElement){
				maxElement =i;
			}
		}
		return  maxElement;
	}

	//function to get min element in given array
	public static int getMinElement(int[] a){

		int minElement = Integer.MAX_VALUE;
		for(int i:a){
			if(i<minElement){
				minElement = i;
			}
		}
		return  minElement;
	}

	public static void main(String[] args) {
		int[] a ={1,423,6,46,34,23,13,53,4};

		int max = getMaxElement(a);
		int min = getMinElement(a);

		System.out.println("max element  = "+max+" and min element = "+min);
	}

}
