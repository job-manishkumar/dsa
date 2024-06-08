package practices.array;

public class CountFrequency {

//	Count number of occurrences (or frequency) in a sorted array

	//brute force approach
	public static int countFrequency(int[] a, int number) {

		int count = 0;
		for (int i : a) {
			if (i == number) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] a = {1, 1, 2, 2, 2, 2, 3};
		int num = 2;
		int count= countFrequency(a,num);
		System.out.println("count = "+count);
	}
}
