package scaler.day46_recursion1;

public class FindFibonacci {

	/*The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
	In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation:
	Fn = Fn-1 + Fn-2
	Given a number A, find and return the Ath Fibonacci Number using recursion.
	Given that F0 = 0 and F1 = 1.*/


	//using loop
	public static int fibonacciSeries(int number) {

		int firstElement = 0;
		int secondElement = 1;
		int nextElement = 0;
		for (int i = 2; i <= number; i++) {
			nextElement = firstElement + secondElement;
			firstElement = secondElement;
			secondElement = nextElement;
		}
		return nextElement;
	}

	//using recursion
	public static int fibonacciNumber(int number) {

		if (number == 0 || number == 1) {
			return number;
		}
		return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
	}

	public static void main(String[] args) {
		int number = 9;
		int element = fibonacciSeries(number);
		System.out.println(element);

		System.out.println("using recursion");
		int element1 = fibonacciNumber(number);
		System.out.println(element1);

	}
}
