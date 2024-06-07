package scaler.day46_recursion1.addtionalproblems;

public class SumOfDigits {
	/*Given a number A, we need to find the sum of its digits using recursion.*/

	//using loop
	public static int getDigitSum(int number) {
		int digitSum = 0;
		while (number > 0) {
			digitSum += number % 10;
			number = number / 10;
		}
		return digitSum;
	}

	public static int getDigitSum1(int number) {

		//base case
		if (number == 0) {
			return 0;
		}
		//main logic
		return number % 10 + getDigitSum(number / 10);
	}

	public static void main(String[] args) {
		int a = 46;
		System.out.println("using loop");
		int sum = getDigitSum(a);
		System.out.println(sum);

		System.out.println("using recursion");
		int sum1 = getDigitSum1(a);
		System.out.println(sum1);

	}
}
