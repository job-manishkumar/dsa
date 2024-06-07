package scaler.day46.addtionalproblems;

public class PrintATo1 {

	/*You are given an integer A, print A to 1  using recursion.
			Note :- After printing all the numbers from A to 1, print a new line.*/

	//using loop

	public static  void printReverseSeries(int number){

		for(int i=number;i>=1;i--){
			System.out.print(i+" ");
		}
		System.out.println();
	}

	//using recursion
	public static void printReverseSeries1(int number){

		//base case
		if(number ==1){
			System.out.println(number);
			return;
		}
		//main logic
		System.out.print(number+" ");
		printReverseSeries1(number-1);
	}
	public static void main(String[] args) {

		int a =10;
		System.out.println("using loop");
		printReverseSeries(a);

		System.out.println("using recursion");
		printReverseSeries1(a);
	}
}
