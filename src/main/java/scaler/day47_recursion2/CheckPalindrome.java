package scaler.day47_recursion2;

import java.util.Arrays;

public class CheckPalindrome {

/*	Write a recursive function that checks whether string A is a palindrome or Not.
	Return 1 if the string A is a palindrome, else return 0.

	Note: A palindrome is a string that's the same when read forward and backward.*/

	//using loop

	public static int checkPalindrome(String str) {

		char[] c = str.toCharArray();
		for (int i = 0, j = c.length - 1; i < j; i++, j--) {
			if (c[i] != c[j]) {
				return 0;
			}
		}
		return 1;
	}

	//using recursion
	public static int checkPalindrome2(String str) {
		char[] c = str.toCharArray();
		return isPalindrome(c, 0, c.length - 1);
	}

	public static int isPalindrome(char[] a, int startIndex, int endIndex) {
		//base condition
		if (startIndex > endIndex) {
			return 1;
		}
		//main logic
		if (a[startIndex] != a[endIndex]) {
			return 0;
		}
		return isPalindrome(a, startIndex + 1, endIndex - 1);
	}

	public static void main(String[] args) {
		String str = "naman";
		//	String str = "strings";
		System.out.println("using loop");
		int res = checkPalindrome(str);
		System.out.println(res);

		System.out.println("using recursion");
		int res1 = checkPalindrome2(str);
		System.out.println(res1);
	}
}
