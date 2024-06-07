package scaler.day47_recursion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllIndicesOfArray {

	/*Given an array of integers A with N elements and a target integer B, the task is to find all the indices at
	which B occurs in the array.

	Note: The problem encourages recursive logic for learning purposes. Although the online judge doesn't enforce
	recursion, it's recommended to use recursive solutions to align with the question's spirit.*/


	//using loop and Array List
	public static List<Integer> getIndices(int[] a, int b) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (b == a[i]) {
				list.add(i);
			}
		}
		return list;
	}


	//using loop and with arraylist
	public static int[] getIndices2(int[] a, int b) {

		int count = 0;
		for (int i : a) {
			if (b == i) {
				count++;
			}
		}
		int[] res = new int[count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (b == a[i]) {
				res[j] = i;
				j++;
			}
		}
		return res;
	}


	//using recursion

	public static int[] getIndices3(int[] a, int b, int count, int index) {


		//base condition
		if (index == a.length) {
			return new int[count];
		}
		//main logic

		if (a[index] == b) {
			int[] res = getIndices3(a, b, count + 1, index + 1);
			res[count] = index;
			return res;

		}
		return getIndices3(a, b, count, index + 1);
	}

	public static void main(String[] args) {
		int[] a = {8, 9, 5, 6, 5, 5};
		int b = 5;
		List<Integer> list = getIndices(a, b);
		System.out.println(list);


		int[] res = getIndices2(a, b);
		System.out.println(Arrays.toString(res));


		int[] res2 = getIndices3(a, b, 0, 0);
		System.out.println(Arrays.toString(res2));
	}
}
