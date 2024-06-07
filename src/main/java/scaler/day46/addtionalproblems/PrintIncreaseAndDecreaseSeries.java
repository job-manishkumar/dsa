package scaler.day46.addtionalproblems;

public class PrintIncreaseAndDecreaseSeries {

	/*Print N numbers in Decreasing Order and then in Increasing Order.
	You are given a positive number N.
	You are required to print the numbers from N to 1.
	You are required to not use any loops. Don't change the signature of the function DecThenInc function.
	Note : Please print an new line after printing the output.*/

	//using loop
	public static void getSeries(int number) {

		for (int i = number; i >= 1; i--) {
			System.out.print(i + " ");
		}
		for (int i = 1; i <= number; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	//using recursion
	public static void getSeries1(int number) {

		//base case
		if (number == 1) {
			System.out.print(number + " ");
			System.out.print(number + " ");
			return;
		}
		//main logic
		System.out.print(number + " ");
		getSeries1(number - 1);
		System.out.print(number + " ");
	}

	public static void main(String[] args) {

		int a = 10;
		System.out.println("using loop");
		getSeries(a);
		System.out.println("using recursion");
		getSeries1(a);
	}
}
