package scaler.day46_recursion1;

public class FindFactorial {

	/*Write a program to find the factorial of the given number A using recursion.
	Note: The factorial of a number N is defined as the product of the numbers from 1 to N.*/

	//using loop
	public static int getFactorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	//using recursion
	public static int getFactorial1(int num) {

		//base case
		if (num == 1) {
			return 1;
		}
		//main logic
		return getFactorial1(num - 1) * num;
	}

	public static void main(String[] args) {

		int a = 4;
		int fact = getFactorial(a);
		System.out.println(fact);

		System.out.println("using recursion");
		int fact1 = getFactorial1(a);
		System.out.println(fact1);
	}
}
