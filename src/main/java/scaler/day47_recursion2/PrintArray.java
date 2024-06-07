package scaler.day47_recursion2;

public class PrintArray {

	/*You are given an array A. Print the elements of the array using recursion.
	NOTE :
	You are required to not use any loops, You can create new functions.
			Don't change the signature of the function PrintArray.
	Print a new empty line after printing the output.*/

	//using loop
	public static void printArray(int[] a){
		for(int i:a){
			System.out.print(i+" ");
		}
		System.out.println();
	}

	//using recursion but base condition is index  = a.length-1
	public static void printArray1(int[] a,int index){

		//base case
		if(index==0){
			System.out.print(a[index]+" ");
			return;
		}
		//main logic
		printArray1(a,index-1);
		System.out.print(a[index]+" ");
	}

	//using recursion but from index 0
	public static void printArray2(int[] a,int index){

		//base condition
		if(index ==a.length){//index ==a.length-1
			//System.out.print(a[index]+" ");
			return;
		}
		System.out.print(a[index]+" ");
		printArray2(a,index+1);
	}


	public static void main(String[] args) {

		int[] a  ={6, -2, 5, 3};
		printArray(a);

		System.out.println("using recursion");
		printArray1(a,a.length-1);
		System.out.println();
		System.out.println("using recursion, index start from 0");
		printArray2(a,0);

	}
}
